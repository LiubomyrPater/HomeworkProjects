package calc;

public abstract class Action {

    protected double a;
    protected double b;

    public Action() {
    }

    public Action(double a) {
        this.a = a;
    }

    public Action(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double action();
}
