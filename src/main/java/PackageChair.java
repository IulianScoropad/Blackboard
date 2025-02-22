import java.util.List;

public class PackageChair implements KnowledgeSource {
    private Blackboard blackboard;

    public PackageChair(Blackboard blackboard) {
        this.blackboard = blackboard;

    }

    @Override
    public void update() {

        List<Chair> chairs = blackboard.getBlackboard();
        for (Chair chair : chairs) {
            if (chair.getSeatStatus() == Status.CUT && chair.getFeetStatus() == Status.ASSEMBLED && chair.getBackrestStatus() == Status.ASSEMBLED && chair.getStabilizerBarStatus() == Status.ASSEMBLED && chair.getPackagingStatus() == Status.NOT_PACKAGED) {
                chair.packaging();
            }
        }
    }
}
