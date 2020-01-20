public class AirConditioner extends ComplexState {
    static int c_Temp;
    static int r_Temp;
    Wait wait;
    On on;
    Off off;

    public AirConditioner() {
        wait = new Wait(this);
        on = new On(this);
        off = new Off(this);
        this.setState(off);
    }

    public void powerOn() {
        c_Temp = 25;
        r_Temp = 25;
        setState(wait);
    }

    public void setRTemp(int temp) {
        r_Temp = temp;
        System.out.println(Main.ANSI_BLUE+"\nset r_temp to "+Main.R+temp);
        if (getCurrentState() == on) {
            On s = (On) getCurrentState();
            s.getMode().entry();
        }

    }

    public void setCTemp(int temp) {
        c_Temp = temp;
        System.out.println(Main.ANSI_BLUE+"\nset c_temp to "+Main.R+temp);
        if (getCurrentState() == on) {
            On s = (On) getCurrentState();
            s.getMode().entry();
        }
    }
}