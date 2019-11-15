package calc;
import java.util.Scanner;
import calc.enums.UsersInterface;
import calc.extendsAction.*;

public abstract class ProgramLogic {

    public static void choiceLanguage(){
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
        }else {
            PrintFrases.badInput();
            choiceLanguage();
        }
    }

    public static void choiceDigit(){
        Scanner digit = new Scanner(System.in);
        PrintFrases.choiceDigit();
        if (digit.hasNextInt()){
            calcProgram(digit.nextInt());
        }else {
            PrintFrases.onlyDigit();
            choiceDigit();
        }
    }

    private static void calcProgram(int theDigit){
        boolean programCalc = true;
        while (programCalc){
            PrintFrases.newCalcAction();
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext("[<]")){
                programCalc = false;
            }else {
                ParsedInputData row = new ParsedInputData(scanner.nextLine());
                if (row.getAct().contains("+")){
                    new Addiction(row.getX(), row.getY(), theDigit);
                }else if (row.getAct().contains("-")){
                    new Subtraction(row.getX(), row.getY(), theDigit);
                }else if (row.getAct().contains("*")){
                    new Multiplicate(row.getX(), row.getY(), theDigit);
                }else if (row.getAct().contains("/")){
                    new Divide(row.getX(), row.getY(), theDigit);
                }else if (row.getAct().contains("!")){
                    new Plug();
                }else if (row.getAct().contains("%")){
                    new DivideByModul(row.getX(), row.getY(), theDigit);
                }else if (row.getAct().contains("S")) {
                    new Sqrt(row.getX(), theDigit);
                }else if (row.getAct().contains("^")){
                    new Pow(row.getX(), row.getY(), theDigit);
                }else {
                    new Plug();
                }
            }
        }
    }
}
