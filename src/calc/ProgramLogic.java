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
