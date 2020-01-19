public class AirConditioner extends ComplexState {
    private boolean power;
    public static double r_Temp;
    public static double c_Temp;
    public ComplexState on;
    public State off;
    public State wait;

    public AirConditioner() {
        on = new On(this);
        off = new Off(this);
        wait = new Wait(this);
        this.setState(off);
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean on) {
        power = on;
    }

    public String setRTemp(int temp) {
        r_Temp = temp;
        on.setState(this.getState());
        return "set r_temp to "+temp;
    }

    public String setCTemp(int temp) {
        c_Temp = temp;
        on.setState(this.getState());
        return "set c_temp to "+temp;
    }
}
