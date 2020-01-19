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

    public void setRTemp(int temp) {
        r_Temp = temp;
        System.out.println(Main.ANSI_BLUE+"\nset r_temp to "+Main.R+temp);
    }

    public void setCTemp(int temp) {
        c_Temp = temp;
        System.out.println(Main.ANSI_BLUE+"\nset c_temp to "+Main.R+temp);
        on.setState(this.getState());
    }
}