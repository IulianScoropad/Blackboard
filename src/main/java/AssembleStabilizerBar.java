import java.util.List;

public class AssembleStabilizerBar implements KnowledgeSource{
    private Blackboard blackboard;

    public AssembleStabilizerBar(Blackboard blackboard) {
        this.blackboard = blackboard;
    }

    @Override
    public void update() {

        List<Chair> chairs = blackboard.getBlackboard();
        for (Chair chair : chairs) {
            if (chair.getSeatStatus() == Status.CUT && chair.getFeetStatus() == Status.ASSEMBLED && chair.getBackrestStatus() == Status.ASSEMBLED && chair.getStabilizerBarStatus() == Status.NOT_ASSEMBLED) {
                chair.assembleStabilizerBar();
            }
        }
    }
}
