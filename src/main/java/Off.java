public class Off extends State {

    public AirConditioner contex;

    public Off(AirConditioner airConditioner) {
        this.contex = airConditioner;
    }

    @Override
    public void entry() {
        System.out.println(Main.B+Main.ANSI_CYAN+"OFF\n");
    }
}
