public class On extends ComplexState {
    Mode mode;
    Operation operation;
    AirConditioner context;

    public On(AirConditioner airConditioner) {
        mode = new Mode(this);
        operation = new Operation(this);
        this.context = airConditioner;
    }

    @Override
    public void entry() {
        System.out.println(Main.B+Main.ANSI_CYAN+"ON"+Main.R);
        mode.entry();
        operation.entry();
    }

    public Mode getMode() {
        return mode;
    }

    public Operation getOperation() {
        return operation;
    }

    public AirConditioner getAirConditioner() {
        return context;
    }
}
