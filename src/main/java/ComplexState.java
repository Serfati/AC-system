public class ComplexState extends State {

    public State state; // current state

    public void setState(State st) {
        if (state != null)
            state.exit();
        if (st != state) {
            this.state = st;
            state.entry();
        }
    }

    public State getCurrentState() {
        return this.state;
    }
}
