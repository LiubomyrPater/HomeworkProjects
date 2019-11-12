package calc;

import static calc.enums.UsersInterface.*;

import java.util.Scanner;

public class Main {

    public static boolean language = true;
    public static boolean programCalc;
    public static Integer theDigit;

    public static void main(String[] args) {
        while (true){
            while (true){
                System.out.println(CHOICE_LANGUAGE.getText());
                System.out.print(EXIT.getText());
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNext("[01<]")){
                    String temp = scanner.nextLine();
                    if (temp.equals("<")){
                        System.exit(0);
                    }
                    language = temp.equals("0") ? true : false;
                    break;
                }else {
                    System.out.println(BAD.getText());
                }
            }
            while (true){
                Scanner digit = new Scanner(System.in);
                System.out.print(CHOICE_DIGIT.getText());
                if (digit.hasNextInt()){
                    Main.theDigit = digit.nextInt();
                    break;
                }
                System.out.println(ONLY_DIGIT.getText());
            }
            programCalc = true;
            while (programCalc){
                Input input = new Input();
                input.setElements();
            }
        }
    }
}
