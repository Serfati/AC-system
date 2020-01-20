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
        int r_Temp = AirConditioner.r_Temp;
        int c_Temp = AirConditioner.c_Temp;

        if (on.getMode().getCurrentState() instanceof Cool && r_Temp-2 >= c_Temp) {
            this.setState(fanning);
            this.setState(cooling);
            AirConditioner.r_Temp = c_Temp;
            return;
        }
        if (on.getMode().getCurrentState() instanceof Heat && r_Temp+2 <= c_Temp) {
            this.setState(fanning);
            this.setState(heating);
            AirConditioner.r_Temp = c_Temp;
            return;
        }

        if (on.getMode().getCurrentState() instanceof Cool && r_Temp < c_Temp) {
            on.getMode().entry();
            this.setState(heating);
            return;
        }

        if (on.getMode().getCurrentState() instanceof Heat && r_Temp > c_Temp) {
            on.getMode().entry();
            this.setState(cooling);
            return;
        }
        if (r_Temp == c_Temp)
            this.setState(fanning);
    }
}