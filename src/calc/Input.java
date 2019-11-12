package calc;

import calc.extendsAction.*;

import java.util.Scanner;

import static calc.enums.UsersInterface.*;

public final class Input {

    private Action action;
    private double digitA;
    private double digitB;
    private Character symbolAction;

    public double getResult() {
        return action.action();
    }

    public void setElements() {
        System.out.print(INPUT.getText());
        System.out.print(EXIT_FROM_CALC.getText());
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext("[<]")){
            Main.programCalc = false;
        }else {
            String textRow = scanner.nextLine();
            String operands[] = textRow.split(" ");
            if (operands.length != 3){
                System.out.println(BAD.getText());
                setElements();
            }else {

                digitA = Double.valueOf(operands[0]);
                symbolAction = operands[1].charAt(0);
                digitB = Double.valueOf(operands[2]);

                switch (symbolAction){
                    case '+':
                        this.action = new Addiction(digitA, digitB);
                        break;
                    case '-':
                        this.action = new Subtraction(digitA, digitB);
                        break;
                    case '*':
                        this.action = new Multiplicate(digitA, digitB);
                        break;
                    case '/':
                        this.action = new Divide(digitA, digitB);
                        break;
                    case '%':
                        this.action = new DivideByModul(digitA, digitB);
                        break;
                    case '!':
                        this.action = new Plug();
                        break;
                    default:{
                        this.action = new Plug();
                    }
                }
                System.out.println(Math.round(getResult() * Math.pow(10, Main.theDigit)) / Math.pow(10, Main.theDigit));
                System.out.println();
            }
        }
    }
}
