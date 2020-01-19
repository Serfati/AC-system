public class Mode extends ComplexState {
    public ComplexState on;
    public State heat;
    public State cool;

    public Mode(On on) {
        this.on = on;
        this.heat = new Heat(this);
        this.cool = new Cool(this);
        this.setState(cool);
    }
}
