package calc.extendsAction;

import calc.Action;
import calc.PrintFrases;

public final class Addiction extends Action {

    public Addiction(double a, double b, int theDigit) {
        super(a, b, theDigit);
        PrintFrases.twoOperandsAction(a, b, "+", (Math.round(action() * Math.pow(10, theDigit)) / Math.pow(10, theDigit)));
    }

    @Override
    public double action() {
        return a + b;
    }
}
