public abstract class State {
    public void entry() {
        System.out.print("");
    }

    public void exit() {
        System.out.print("");
    }

    public void cardInserted() {
        System.out.println("error");
    }

    public void abort() {
        System.out.println("error");
    }

    public void ready() {
        System.out.print("error");
    }

    public void readCard() {
        System.out.print("error");
    }

    public void ejectCard() {
        System.out.print("error");
    }

    public void transfer(int x) {
        System.out.print("error");
    }
}
