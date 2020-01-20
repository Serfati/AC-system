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
        setState(wait);
    }

    public void setRTemp(int temp) {
        r_Temp = temp;
        System.out.println(Main.ANSI_BLUE+"\nset r_temp to "+Main.R+temp);

        if (getCurrentState() == on) {
            On s = (On) getCurrentState();
            s.getMode().entry();
            s.getOperation().entry();
        }
    }

    public void setCTemp(int temp) {
        c_Temp = temp;
        System.out.println(Main.ANSI_BLUE+"\nset c_temp to "+Main.R+temp);
        if (getCurrentState() == on) {
            On s = (On) getCurrentState();
            s.getMode().entry();
            s.getOperation().entry();
        }
    }
}