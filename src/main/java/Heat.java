public class Heat extends Mode {
    public ComplexState mode;

    public Heat(Mode mode) {
        this.mode = mode;
    }

    @Override
    public void entry() {
        System.out.println(Main.ANSI_BLUE+"MODE-HEAT"+Main.R);
    }
}
