public class NewDocument implements  IDocumentState {

    @Override
    public void next(Document pkg) {
        pkg.setState(new SubmiitedState());
    }

    @Override
    public void prev(Document pkg) {
        System.out.println("Không thể quay lại trước");
    }

    @Override
    public void printStatus() {
        System.out.println("new Document");
    }
}
