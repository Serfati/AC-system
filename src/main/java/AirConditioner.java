public class AirConditioner {
    private boolean power;
    private Mode current;
    private int c_Temp;
    private int r_Temp;

    public AirConditioner() {
        System.out.println(Main.B+Main.ANSI_CYAN+off()+"\n");
    }

    private void setCurrentMode() {
        if (r_Temp <= c_Temp+5)
            current = new HeatMode();
        if (c_Temp <= r_Temp+5)
            current = new CoolMode();
    }

    public String on() {
        power = true;
        c_Temp = 25;
        r_Temp = 25;
        setCurrentMode();
        return "ON";
    }

    public String off() {
        power = false;
        return "OFF";
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean on) {
        power = on;
    }

    public String setRTemp(int temp) {
        r_Temp = temp;
        setCurrentMode();
        return "set r_temp to "+temp;
    }

    public String setCTemp(int temp) {
        c_Temp = temp;
        setCurrentMode();
        return "set c_temp to "+temp;
    }

    public String waiting(int sec) {
        switch(sec) {
            case 30:
                return "WAITING "+sec+" SECONDS";
            case 120:
                return "OPERATION-FANNING ("+sec+" SECONDS AT LEAST)";
        }
        return "";
    }

    public Mode getCurrent() {
        return current;
    }
}
