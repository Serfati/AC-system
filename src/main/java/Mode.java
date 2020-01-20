public class Mode extends ComplexState {
    On on;
    Heat heat;
    Cool cool;

    public Mode(On on) {
        this.on = on;
        this.heat = new Heat(this);
        this.cool = new Cool(this);
    }

    @Override
    public void entry() {
        int r_Temp = AirConditioner.r_Temp;
        int c_Temp = AirConditioner.c_Temp;
        if (getCurrentState() == null) {
            setState(r_Temp < c_Temp ? heat : cool);
            return;
        }
        if (r_Temp < c_Temp-5) setState(heat);
        if (r_Temp > c_Temp+5) setState(cool);
    }
}