import java.util.List;

public class CutSeat implements KnowledgeSource  {

    private Blackboard blackboard;

    public CutSeat(Blackboard blackboard) {
        this.blackboard = blackboard;

    }

    @Override
    public void update() {

        List<Chair> chairs = blackboard.getBlackboard();
        for (Chair chair : chairs) {
            if (chair.getSeatStatus() == Status.NOT_CUT) {
                chair.cutSeat();
            }
        }
    }
}
