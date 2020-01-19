public class Fanning extends State {
    public ComplexState operation;

    public Fanning(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void entry() {
        System.out.println(Main.ANSI_BLUE+"OPERATION-FANNING (120 SECONDS AT LEAST)\n"+Main.R);
    }
}
