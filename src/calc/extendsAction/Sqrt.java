package calc.extendsAction;

import calc.Action;

public final class Sqrt extends Action {

    public Sqrt(double a) {
        super(a);
    }

    @Override
    public double action() {
        return Math.sqrt(a);
    }
}
