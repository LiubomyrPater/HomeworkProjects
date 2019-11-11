package calc;

import calc.interfaces.Addiction;
import calc.interfaces.Divide;
import calc.interfaces.Multiplicate;
import calc.interfaces.Substraction;

public abstract class MathLogic implements Substraction, Divide, Multiplicate, Addiction {

    @Override
    public double addiction(double a, double b) {
        return 0;
    }

    @Override
    public double divide(double a, double b) {
        return 0;
    }

    @Override
    public double multiplicate(double a, double b) {
        return 0;
    }

    @Override
    public double substraction(double a, double b) {
        return 0;
    }
}
