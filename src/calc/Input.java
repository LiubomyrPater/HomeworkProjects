package calc;

import calc.enums.UsersInterface;
import calc.extendsAction.*;

import java.util.Scanner;

public final class Input {

    private Action action;
    private double digitA;
    private double digitB;
    private Character symbolAction;

    public double getResult() {
        return action.action();
    }

    public void setElements() {
        Scanner scanner = new Scanner(System.in);

        digitA = scanner.nextDouble();
        symbolAction = scanner.next().trim().charAt(0);
        digitB = scanner.nextDouble();

        switch (symbolAction){
            case '+': this.action = new Addiction(digitA, digitB);
                break;
            case '-': this.action = new Subtraction(digitA, digitB);
                break;
            case '*': this.action = new Multiplicate(digitA, digitB);
                break;
            case '/': this.action = new Divide(digitA, digitB);
                break;
            case '%': this.action = new DivideByModul(digitA, digitB);
                break;
            default:{
            }
        }
    }
}
