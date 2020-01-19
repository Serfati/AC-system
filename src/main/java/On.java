public class On extends ComplexState {
    public ComplexState operation;
    public ComplexState mode;
    public AirConditioner contex;

    public On(AirConditioner airConditioner) {
        this.contex = airConditioner;
    }

    @Override
    public void entry() {
        System.out.println(Main.B+Main.ANSI_CYAN+"ON"+Main.R);
        AirConditioner.c_Temp = 25;
        AirConditioner.r_Temp = 25;
        mode = new Mode(this);
        operation = new Operation(this);
    }

    @Override
    public void setState(State st) {
        //TODO still missing
        if (AirConditioner.r_Temp-5 >= AirConditioner.c_Temp) {
            mode.setState(new Cool((Mode) mode));
            operation.setState(new Fanning((Operation) operation));
            operation.setState(new Cooling((Operation) operation));
            return;
        }

        if (AirConditioner.r_Temp+5 <= AirConditioner.c_Temp) {
            mode.setState(new Heat((Mode) mode));
            operation.setState(new Fanning((Operation) operation));
            operation.setState(new Heating((Operation) operation));
            return;
        }
        operation.getState().entry();
    }
}
