package calc;
import java.util.Scanner;
import calc.enums.UsersInterface;
import calc.extendsAction.*;

public abstract class ProgramLogic {

    public static void choiceLanguage(){
        while (true){
            PrintFrases.choiceLanguage();
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext("[01<]")){
                String temp = scanner.nextLine();
                if (temp.equals("<")){
                    System.exit(0);
                }else{
                    if (temp.equals("1")){
                        UsersInterface.language = false;
                    }else {
                        UsersInterface.language = true;
                    }
                }
                break;
            }else {
                PrintFrases.badInput();
            }
        }
        choiceDigit();
    }

    private static void choiceDigit(){
        int theDigit;
        while (true){
            Scanner digit = new Scanner(System.in);
            PrintFrases.choiceDigit();
            if (digit.hasNextInt()){
                theDigit = digit.nextInt();
                break;
            }
            PrintFrases.onlyDigit();
        }
        calcProgram(theDigit);
    }

    private static void calcProgram(int theDigit){
        boolean programCalc = true;
        while (programCalc){
            PrintFrases.newCalcAction();
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext("[<]")){
                programCalc = false;
            }else {
                String textRow = scanner.nextLine();
                textRow = textRow.replaceAll("\\s+","");
                textRow = textRow.replaceAll("[^-0123456789,./*!%+S^]","");
                textRow = textRow.replace(',', '.');
                int helpMinus = 1;
                if (textRow.startsWith("-")){
                    helpMinus = -1;
                    textRow = textRow.replaceFirst("-","");
                }
                String operands[] = textRow.split("[-!%*/S^+]");

                double digitA = 0;
                double digitB = 0;
                if (!operands[0].isEmpty()){
                    if (operands.length == 2){
                        digitA = (Double.parseDouble(operands[0])) * helpMinus;
                        digitB = Double.parseDouble(operands[1]);
                    }else if (operands.length == 1){
                        digitA = (Double.parseDouble(operands[0])) * helpMinus;
                    }else {
                        PrintFrases.badInput();
                    }
                }
                Action action;
                if (textRow.contains("+")){
                    action = new Addiction(digitA, digitB);
                    PrintFrases.twoOperandsAction(digitA, digitB, "+");
                }else if (textRow.contains("-")){
                    action = new Subtraction(digitA, digitB);
                    PrintFrases.twoOperandsAction(digitA, digitB, "-");
                }else if (textRow.contains("*")){
                    action = new Multiplicate(digitA, digitB);
                    PrintFrases.twoOperandsAction(digitA, digitB, "*");
                }else if (textRow.contains("/")){
                    action = new Divide(digitA, digitB);
                    PrintFrases.twoOperandsAction(digitA, digitB, "/");
                }else if (textRow.contains("!")){
                    action = new Plug();
                    PrintFrases.oneOnerandAction(digitA,"!");
                }else if (textRow.contains("%")){
                    action = new DivideByModul(digitA, digitB);
                    PrintFrases.twoOperandsAction(digitA, digitB, "MOD");
                }else if (textRow.contains("S")) {
                    action = new Sqrt(digitA);
                    PrintFrases.oneOnerandAction(digitA,"\u221A");
                }else if (textRow.contains("^")){
                    action = new Pow(digitA, digitB);
                    PrintFrases.twoOperandsAction(digitA, digitB, "^");
                }else {
                    action = new Plug();
                }
                PrintFrases.result(Math.round(action.action() * Math.pow(10, theDigit)) / Math.pow(10, theDigit));
                //PrintFrases.result(action.action());
            }
        }
    }

    private static void inputData(){}

    private static void outputResult(){}

    private static void setElements() {

    }

}
