package calc.implementInterfaces;

import calc.interfaces.OperationTwoDigit;

public class Subtraction implements OperationTwoDigit {

    @Override
    public double action(double a, double b) {
        return a - b;
    }
}
