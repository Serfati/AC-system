public class Wait extends State {
    AirConditioner context;

    public Wait(AirConditioner airConditioner) {
        this.context = airConditioner;
    }

    @Override
    public void entry() {
        System.out.println(Main.ANSI_BLUE+"WAITING 30 SECONDS"+Main.R);
        context.setState(context.on);
    }
}
