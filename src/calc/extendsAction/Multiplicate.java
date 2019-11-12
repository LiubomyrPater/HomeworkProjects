package calc.extendsAction;

import calc.Action;

public final class Multiplicate extends Action {

    public Multiplicate(double a, double b) {
        super(a, b);
    }

    @Override
    public double action() {
        return a * b;
    }
}
