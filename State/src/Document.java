public class Document {
    private IDocumentState state = new NewDocument();

    // getter, setter


    public IDocumentState getState() {
        return state;
    }

    public void setState(IDocumentState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
