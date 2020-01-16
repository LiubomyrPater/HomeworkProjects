package streams.vr;

import service.Input;
import streams.vr.enums.UserInterface;

public abstract class Menu {

    static void printMainMenu(){
        System.out.print(UserInterface.PRINT_MENU.getText());
    }

    static Boolean choiceChapter(){
        Boolean program = true;
        String chapter = Input.getString();
        switch (chapter.trim()){
            case "1":{
                SingletonVR.getInstance().addFraction();
                break;
            }case "2":{
                Fraction temp = SingletonVR.getInstance().choiceFraction();
                if (temp != null)
                    SingletonVR.getInstance().delFraction(temp);
                break;
            }case "3":{
                SingletonVR.getInstance().viewAllFractions();
                break;
            }case "4":{
                Fraction temp = SingletonVR.getInstance().choiceFraction();
                if (temp != null)
                    temp.clearFraction();
                break;
            }case "5":{
                Fraction temp = SingletonVR.getInstance().choiceFraction();
                if (temp != null)
                    temp.viewDeputyFraction();
                break;
            }case "6":{
                Fraction temp = SingletonVR.getInstance().choiceFraction();
                if (temp != null){
                    Deputy deputy = SingletonVR.getInstance().choiceDeputy();
                    if (deputy != null)
                        temp.addDeputyInFraction(deputy);
                }
                break;
            }case "7":{
                Fraction temp = SingletonVR.getInstance().choiceFraction();
                if (temp != null){
                    Deputy deputy = SingletonVR.getInstance().choiceDeputy();
                    if (deputy != null)
                        temp.delDeputyFromFraction(deputy);
                }
                break;
            }case "8":{
                Fraction temp = SingletonVR.getInstance().choiceFraction();
                if (temp != null)
                    temp.viewAllKhabar();
                break;
            }case "9":{
                Fraction temp = SingletonVR.getInstance().choiceFraction();
                if (temp != null)
                    temp.theBigestKhabar();
                break;
            }case "0":{
                Deputy deputy = SingletonVR.getInstance().choiceDeputy();
                if (deputy != null)
                    deputy.givKhabar();
                break;
            }case "+":{
                SingletonVR.getInstance().viewDeputies();
                break;
            }case "<":{
                program = false;
                break;
            }default:{
                System.out.println(UserInterface.TRY_AGAIN.getText());
            }
        }
        return program;
    }

























}
