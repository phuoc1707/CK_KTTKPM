public class ApprovedState implements IDocumentState {
    @Override
    public void next(Document pkg) {
        System.out.println("ERROR");
    }

    @Override
    public void prev(Document pkg) {
        pkg.setState(new SubmiitedState());
    }

    @Override
    public void printStatus() {
        System.out.println("CHẤP NHẬN");
    }
}
