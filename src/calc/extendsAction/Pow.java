package calc.extendsAction;

import calc.Action;

public final class Pow extends Action {
    public Pow(double a, double b) {
        super(a, b);
    }

    @Override
    public double action() {
        return Math.pow(a,b);
    }
}
