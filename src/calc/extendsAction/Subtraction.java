package calc.extendsAction;

import calc.Action;

public final class Subtraction extends Action {

    public Subtraction(double a, double b) {
        super(a, b);
    }

    @Override
    public double action() {
        return a - b;
    }
}
