import java.util.List;

public class AssembleFeet implements KnowledgeSource {

    private Blackboard blackboard;
    public AssembleFeet(Blackboard blackboard) {
        this.blackboard = blackboard;

    }

    @Override
    public void update() {

        List<Chair> chairs = blackboard.getBlackboard();
        for (Chair chair : chairs) {
            if (chair.getSeatStatus() == Status.CUT && chair.getFeetStatus() == Status.NOT_ASSEMBLED) {
                chair.assembleFeet();

            }
        }
    }
}
