public class Main {
    public static void main(String[] args) {


        Blackboard blackboard = new Blackboard();


        Chair chair1 = new Chair("Standart Chair №1");
        Chair chair2 = new Chair("Standart Chair №2");
        blackboard.addToBlackboard(chair1);
        blackboard.addToBlackboard(chair2);


        KnowledgeSource cutSeat = new CutSeat(blackboard);
        KnowledgeSource assembleFeet = new AssembleFeet(blackboard);
        KnowledgeSource assembleBackrest = new AssembleBackrest(blackboard);
        KnowledgeSource assembleStabilizerBar = new AssembleStabilizerBar(blackboard);
        KnowledgeSource packageChair = new PackageChair(blackboard);


        cutSeat.update();
        assembleFeet.update();
        assembleBackrest.update();
        assembleStabilizerBar.update();
        packageChair.update();

        blackboard.getBlackboard();

        System.out.println(chair1);
        System.out.println(chair2);
    }

}
