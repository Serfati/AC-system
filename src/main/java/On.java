public class On extends ComplexState {

    private Operation operation;
    private Mode mode;
    public AirConditioner contex;

    public On(AirConditioner airConditioner) {
        mode = new Mode(this);
        operation = new Operation(this);
        this.contex = airConditioner;
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

    public AirConditioner getAirConditioner() {
        return contex;
    }
}
