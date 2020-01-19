public class ComplexState extends State {

    public State state;

    public State getState() {
        return this.state;
    }

    public void setState(State st) {
        if (state != null)
            state.exit();
        this.state = st;
        state.entry();
    }
}
