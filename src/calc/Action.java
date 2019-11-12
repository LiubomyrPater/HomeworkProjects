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

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public abstract double action();
}
