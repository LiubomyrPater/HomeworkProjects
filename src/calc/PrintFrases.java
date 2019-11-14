package calc;

import static calc.enums.UsersInterface.*;

public abstract class PrintFrases {

     public static void choiceLanguage(){
         System.out.println(CHOICE_LANGUAGE.getText());
         System.out.print(EXIT.getText());
     }

     public static void badInput(){
         System.out.println(BAD.getText());
     }

     public static void choiceDigit(){
         System.out.print(CHOICE_DIGIT.getText());
     }

     public static void onlyDigit(){
         System.out.println(ONLY_DIGIT.getText());
     }

     public static void newCalcAction(){
         System.out.println();
         System.out.println(ONLY_ACTION.getText());
         System.out.print(INPUT.getText());
         System.out.print(EXIT_FROM_CALC.getText());
     }

     public static void oneOnerandAction(Double a, String action){
         System.out.print(action + " "  + a + " = ");
     }

     public static void twoOperandsAction(Double a, Double b, String action){
         System.out.print(a + " "  + action + " " + b + " = ");
     }

     public static void result(Double result){
         System.out.println(result);
     }
}
