public class Heating extends State {
    Operation operation;

    public Heating(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void entry() {
        System.out.println(Main.ANSI_BLUE+"OPERATION-HEATING"+Main.R);
    }
}
