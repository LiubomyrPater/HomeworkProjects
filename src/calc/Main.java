package calc;

import calc.enums.UsersInterface;

public class Main {

    public static void main(String[] args) {

        UsersInterface.language = true;

        while (true){
            ProgramLogic.choiceLanguage();
            ProgramLogic.choiceDigit();
        }
    }
}
