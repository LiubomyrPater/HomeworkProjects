package calc.extendsAction;

import calc.Action;

public final class Addiction extends Action {

    public Addiction(double a, double b) {
        super(a, b);
    }

    @Override
    public double action() {
        return a + b;
    }
}
