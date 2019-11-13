package calc;

import calc.extendsAction.*;

import java.util.Scanner;

import static calc.enums.UsersInterface.*;

public final class Input {

    private Action action;
    private double digitA;
    private double digitB;
    private String symbolAction = "";

    private String parsedSplitRow(String textRow){
        textRow = textRow.replaceAll("\\s+","");
        textRow = textRow.replaceAll("[^-0123456789,./*!%+S^]","");
        textRow = textRow.replace(',', '.');
        String operands[] = textRow.split("[-!%*/S^+]");

        if (!operands[0].isEmpty()){
            if (operands.length == 2){
                digitA = Double.parseDouble(operands[0]);
                digitB = Double.parseDouble(operands[1]);
            }else if (operands.length == 1){
                digitA = Double.parseDouble(operands[0]);
            }else {
                System.out.println(BAD.getText());
                setElements();
            }
        }else {
            System.out.println(BAD.getText());
            setElements();
        }
        return textRow;
    }

    public void setElements() {
        System.out.print(INPUT.getText());
        System.out.print(EXIT_FROM_CALC.getText());
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext("[<]")){
            Main.programCalc = false;
        }else {
            String textRow = scanner.nextLine();
            String newTextRow = parsedSplitRow(textRow);
            if (newTextRow.contains("+")){
                action = new Addiction(digitA, digitB);
                symbolAction = "+";
                System.out.print(digitA + " "  + symbolAction + " " + digitB + " = ");
            }else if (newTextRow.contains("-")){
                action = new Subtraction(digitA, digitB);
                symbolAction = "-";
                System.out.print(digitA + " "  + symbolAction + " " + digitB + " = ");
            }else if (newTextRow.contains("*")){
                action = new Multiplicate(digitA, digitB);
                symbolAction = "*";
                System.out.print(digitA + " "  + symbolAction + " " + digitB + " = ");
            }else if (newTextRow.contains("/")){
                action = new Divide(digitA, digitB);
                symbolAction = "/";
                System.out.print(digitA + " "  + symbolAction + " " + digitB + " = ");
            }else if (newTextRow.contains("!")){
                action = new Plug();
                symbolAction = "!";
                System.out.print(digitA + " "  + symbolAction + " = ");
            }else if (newTextRow.contains("%")){
                action = new DivideByModul(digitA, digitB);
                symbolAction = "MOD";
                System.out.print(digitA + " "  + symbolAction + " " + digitB + " = ");
            }else if (newTextRow.contains("S")) {
                action = new Sqrt(digitA);
                symbolAction = "\u221A";
                System.out.print(symbolAction + " "  + digitA + " = ");
            }else if (newTextRow.contains("^")){
                action = new Pow(digitA, digitB);
                symbolAction = "^";
                System.out.print(digitA + " "  + symbolAction + " " + digitB + " = ");
            }else {
                action = new Plug();
            }
            //System.out.println(Math.round(action.action() * Math.pow(10, Main.theDigit)) / Math.pow(10, Main.theDigit));
            System.out.println(action.action());
        }
    }
}
