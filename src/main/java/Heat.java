public class Heat extends State {
    Mode mode;

    public Heat(Mode mode) {
        this.mode = mode;
    }

    @Override
    public void entry() {
        System.out.println(Main.ANSI_BLUE+"MODE-HEAT"+Main.R);
    }
}
