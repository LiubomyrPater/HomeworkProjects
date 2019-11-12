package calc.implementInterfaces;

import calc.interfaces.OperationTwoDigit;

public class Multiplicate implements OperationTwoDigit {

    @Override
    public double action(double a, double b) {
        return a * b;
    }
}
