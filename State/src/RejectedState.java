public class RejectedState implements  IDocumentState{
    @Override
    public void next(Document pkg) {
        System.out.println("ĐÃ HỦY");
    }

    @Override
    public void prev(Document pkg) {
        pkg.setState(new SubmiitedState());
    }

    @Override
    public void printStatus() {
        System.out.println("HỦY");
    }
}
