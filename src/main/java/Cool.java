public class Cool extends State {
    public Mode mode;

    public Cool(Mode mode) {
        this.mode = mode;
    }

    @Override
    public void entry() {
        System.out.println(Main.ANSI_BLUE+"MODE-COOL"+Main.R);
    }
}
