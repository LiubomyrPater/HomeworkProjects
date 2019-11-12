package calc.extendsAction;

import calc.Action;

public final class Divide extends Action {

    public Divide(double a, double b) {
        super(a, b);
    }

    @Override
    public double action() {
        return a / b;
    }
}
