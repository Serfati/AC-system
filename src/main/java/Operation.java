public class Operation extends ComplexState {

    State heating;
    State cooling;
    State fanning;
    On on;

    public Operation(State on) {
        heating = new Heating(this);
        cooling = new Cooling(this);
        fanning = new Fanning(this);
        this.on = (On) on;
    }

    public void entry() {
        //TODO still missing
        this.setState(fanning);
    }
}