public class Operation extends ComplexState {
    public ComplexState on;
    public State fanning;
    public State colling;
    public State heating;

    public Operation(On on) {
        this.on = on;
        this.fanning = new Fanning(this);
        this.colling = new Cooling(this);
        this.heating = new Heating(this);
        this.setState(fanning);
    }

    public Operation() {
    }

    @Override
    public void entry() {
        System.out.println(Main.ANSI_BLUE+"-"+Main.R);
    }
}
