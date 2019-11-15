package calc.extendsAction;

import calc.Action;
import calc.PrintFrases;

public final class Sqrt extends Action {

    public Sqrt(double a, int theDigit) {
        super(a, theDigit);
        PrintFrases.oneOperandAction(a,"\u221A", (Math.round(action() * Math.pow(10, theDigit)) / Math.pow(10, theDigit)));
    }

    @Override
    public double action() {
        return Math.sqrt(a);
    }
}
