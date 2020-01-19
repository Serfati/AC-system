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
        if (state != null)
            state.exit();
        if (AirConditioner.r_Temp <= AirConditioner.c_Temp+5) {
            mode.setState(new Heat((Mode) mode).mode);
            operation.setState(new Heating((Operation) operation).operation);
            mode.entry();
            operation.entry();
        }
        if (AirConditioner.c_Temp <= AirConditioner.r_Temp+5) {
            mode.setState(new Cool((Mode) mode).mode);
            operation.setState(new Cooling((Operation) operation).operation);
            mode.entry();
            operation.entry();
        }
        if (state != null)
            state.entry();
    }
}
