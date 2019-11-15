package calc;

import static calc.enums.UsersInterface.*;

public abstract class PrintFrases {

     public static void choiceLanguage(boolean language){
         System.out.println(CHOICE_LANGUAGE.getText(language));
         System.out.print(EXIT.getText(language));
     }

     public static void badInput(boolean language){
         System.out.println(BAD.getText(language));
     }

     public static void choiceDigit(boolean language){
         System.out.print(CHOICE_DIGIT.getText(language));
     }

     public static void onlyDigit(boolean language){
         System.out.println(ONLY_DIGIT.getText(language));
     }

     public static void newCalcAction(boolean language){
         System.out.println();
         System.out.println(ONLY_ACTION.getText(language));
         System.out.print(INPUT.getText(language));
         System.out.print(EXIT_FROM_CALC.getText(language));
     }

     public static void actionEmpty(boolean language){
         System.out.println(ACTION_EMPTY.getText(language));
     }

     public static void oneOperandAction(double a, String action, double result){
         System.out.println(action + " "  + a + " = " + result);
     }

     public static void twoOperandsAction(double a, double b, String action, double result){
         System.out.println(a + " "  + action + " " + b + " = " + result);
     }

}
