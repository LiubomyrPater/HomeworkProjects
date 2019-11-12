package calc.extendsAction;

import calc.Action;

public final class DivideByModul extends Action {

    public DivideByModul(double a, double b) {
        super(a, b);
    }

    @Override
    public double action() {
        return a % b;
    }
}
