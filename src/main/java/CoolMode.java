public class CoolMode extends State {
    public ComplexState mode;

    public CoolMode(Mode mode) {
        this.mode = mode;
    }

    @Override
    public void entry() {
        System.out.println("MODE-COOL");
    }
}
