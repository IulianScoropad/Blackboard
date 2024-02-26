import java.util.List;

public class AssembleBackrest implements KnowledgeSource {
    private Blackboard blackboard;

    public AssembleBackrest(Blackboard blackboard) {
        this.blackboard = blackboard;

    }

    @Override
    public void update() {
        List<Chair> chairs = blackboard.getBlackboard();
        for (Chair chair  : chairs)
        {
            if (chair.getSeatStatus() == Status.CUT && chair.getFeetStatus() == Status.ASSEMBLED && chair.getBackrestStatus() == Status.NOT_ASSEMBLED) {

                chair.assembleBackrest();

            }

        }
    }
}
