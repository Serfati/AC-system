public class Cooling extends State {
    Operation operation;

    public Cooling(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void entry() {
        System.out.println(Main.ANSI_BLUE+"OPERATION-COOLING"+Main.R);
    }
}
