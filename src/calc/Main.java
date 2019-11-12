package calc;

import static calc.enums.UsersInterface.*;

import java.util.Scanner;

public class Main {

    public static boolean language = true;
    public static boolean program = true;

    public static void main(String[] args) {
        while (true){
            System.out.print(CHOICE_LANGUAGE.getText());
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext("[01]")){
                String temp = scanner.nextLine();
                language = temp.equals("0") ? true : false;
                break;
            }else {
                System.out.println(BAD.getText());
            }
        }
        while (program){
            System.out.print(INPUT.getText());
            Input input = new Input();
            input.setElements();
            System.out.println(input.getResult());

        }
    }
}
