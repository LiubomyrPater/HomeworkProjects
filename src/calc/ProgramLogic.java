package calc;
import java.util.Scanner;
import calc.extendsAction.*;

public abstract class ProgramLogic {

    public static boolean choiceLanguage(boolean language){
        boolean recurs = true;
        PrintFrases.choiceLanguage(language);
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext("[01<]")){
            String temp = scanner.nextLine();
            if (temp.equals("<")){
                System.exit(0);
            }else{
                if (temp.equals("1")){
                    ProgramLogic.choiceDigit(false);
                    recurs = false;
                }else {
                    ProgramLogic.choiceDigit(true);
                    recurs = true;
                }
            }
        }else {
            PrintFrases.badInput(language);
            choiceLanguage(language);
        }
        return recurs;
    }

    public static void choiceDigit(boolean language){
        Scanner digit = new Scanner(System.in);
        PrintFrases.choiceDigit(language);
        if (digit.hasNextInt()){
            calcProgram(digit.nextInt(), language);
        }else {
            PrintFrases.onlyDigit(language);
            choiceDigit(language);
        }
    }

    private static void calcProgram(int theDigit, boolean language){
        PrintFrases.newCalcAction(language);
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext("[<]")){
            ParsedInputData row = new ParsedInputData(scanner.nextLine(), language);
            if (row.getAct().contains("+")){
                new Addiction(row.getX(), row.getY(), theDigit);
            }else if (row.getAct().contains("-")){
                new Subtraction(row.getX(), row.getY(), theDigit);
            }else if (row.getAct().contains("*")){
                new Multiplicate(row.getX(), row.getY(), theDigit);
            }else if (row.getAct().contains("/")){
                new Divide(row.getX(), row.getY(), theDigit);
            }else if (row.getAct().contains("!")){
                new Plug(language);
            }else if (row.getAct().contains("%")){
                new DivideByModul(row.getX(), row.getY(), theDigit);
            }else if (row.getAct().contains("S")) {
                new Sqrt(row.getX(), theDigit);
            }else if (row.getAct().contains("^")){
                new Pow(row.getX(), row.getY(), theDigit);
            }else {
                new Plug(language);
            }
            ProgramLogic.calcProgram(theDigit,language);
        }
    }
}
