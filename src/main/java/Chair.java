public class Chair {

    private Status seatStatus;
    private Status feetStatus;
    private Status backrestStatus;
    private Status stabilizerBarStatus;
    private Status packagingStatus;
    private String name;



    public Chair(String name) {
        seatStatus = Status.NOT_CUT;
        feetStatus = Status.NOT_ASSEMBLED;
        backrestStatus = Status.NOT_ASSEMBLED;
        stabilizerBarStatus = Status.NOT_ASSEMBLED;
        packagingStatus = Status.NOT_PACKAGED;
        this.name = name;
    }



    public  Status getSeatStatus() {
        return seatStatus;
    }

    public  void cutSeat() {
        seatStatus = Status.CUT;
    }

    public  Status getFeetStatus() {
        return feetStatus;
    }

    public  void assembleFeet() {
        feetStatus = Status.ASSEMBLED;
    }

    public  Status getBackrestStatus() {
        return backrestStatus;
    }

    public  void assembleBackrest() {
        backrestStatus = Status.ASSEMBLED;
    }

    public  Status getStabilizerBarStatus() {
        return stabilizerBarStatus;
    }

    public  void assembleStabilizerBar() {
        stabilizerBarStatus = Status.ASSEMBLED;
    }

    public  Status getPackagingStatus() {
        return packagingStatus;
    }

    public  void packaging() {
        packagingStatus = Status.PACKAGED;
    }

    @Override
    public String toString() {
        return  name + " ==" +
                " cutSeatStatus=" + seatStatus +
                " -> assembleFeetStatus=" + feetStatus +
                "-> assembleBackrestStatus=" + backrestStatus +
                "-> assembleStabilizerStatus=" + stabilizerBarStatus +
                "-> packageChairStatus=" + packagingStatus;
    }
}
