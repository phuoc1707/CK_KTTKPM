public class TestState {
    public static void main(String[] args) {
        Document document= new Document();
        document.printStatus();
        System.out.println("===============================================================");
        document.nextState();
        document.printStatus();
//
        System.out.println("===============================================================");
        document.previousState();
        document.printStatus();

//        System.out.println("===============================================================");
//        document.nextState();
//        document.printStatus();
    }
}
