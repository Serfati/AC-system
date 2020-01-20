public class Off extends State {
    AirConditioner context;

    public Off(AirConditioner airConditioner) {
        this.context = airConditioner;
    }

    @Override
    public void entry() {
        System.out.println(Main.B+Main.ANSI_CYAN+"OFF\n");
    }
}
