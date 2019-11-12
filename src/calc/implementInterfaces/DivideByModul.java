package calc.implementInterfaces;

import calc.interfaces.OperationTwoDigit;

public class DivideByModul implements OperationTwoDigit {

    @Override
    public double action(double a, double b) {
        return a % b;
    }
}
