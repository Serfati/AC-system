public class Cooling extends Operation {
    public ComplexState operation;

    public Cooling(Operation operation) {
        super();
        this.operation = operation;
    }

    @Override
    public void entry() {
        System.out.println(Main.ANSI_BLUE+"OPERATION-COOLING"+Main.R);
    }
}
