public class SubmiitedState implements IDocumentState{
    @Override
    public void next(Document pkg) {
        pkg.setState(new ApprovedState());
    }

    @Override
    public void prev(Document pkg) {
        pkg.setState(new RejectedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Đang xem xét");
    }
}
