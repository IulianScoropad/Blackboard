import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Blackboard {
    private List<Chair> blackboard;

    public Blackboard() {
        blackboard = new ArrayList<>();
    }

    public  void addToBlackboard(Chair chair) {
        blackboard.add(chair);
    }

    public List<Chair> getBlackboard() {
        return blackboard;
    }
}
