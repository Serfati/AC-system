public class AirConditioner extends ComplexState {
    public static int c_Temp;
    public static int r_Temp;
    public Wait wait;
    public On on;
    public Off off;

    public AirConditioner() {
        wait = new Wait(this);
        on = new On(this);
        off = new Off(this);
        this.setState(off);
    }

    public void turnOn() {
        c_Temp = 25;
        r_Temp = 25;
        setState(wait);
    }

    public void setRTemp(int temp) {
        r_Temp = temp;
        System.out.println(Main.ANSI_BLUE+"\nset r_temp to "+Main.R+temp);
        if (getCurrentState() == on)
            on.getCurrentState().entry();

    }

    public void setCTemp(int temp) {
        c_Temp = temp;
        System.out.println(Main.ANSI_BLUE+"\nset c_temp to "+Main.R+temp);
        if (getCurrentState() == on)
            on.getCurrentState().entry();
    }

    public int getR_Temp() {
        return r_Temp;
    }

    public int getC_Temp() {
        return c_Temp;
    }
}