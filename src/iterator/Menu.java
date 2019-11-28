package iterator;

import service.Input;

public abstract class Menu {

    protected static void printMainMenu(){
        System.out.println("\n" +
                                    "Введіть 1 щоб додати фракцію\n" +
                                    "Введіть 2 щоб видалити конкретну фракцію\n" +
                                    "Введіть 3 щоб вивести усі фракції\n" +
                                    "Введіть 4 щоб очистити конкретну фракцію\n" +
                                    "Введіть 5 щоб вивести депутатів фракції\n" +
                                    "Введіть 6 щоб додати депутата в фракцію\n" +
                                    "Введіть 7 щоб видалити депутата з фракції\n" +
                                    "Введіть 8 щоб вивести список хабарників у фракції\n" +
                                    "Введіть 9 щоб вивести найбільшого хабарника у фракції\n" +
                                    "Введіть 0 щоб запропонувати депутату хабар\n" +
                                    "Введіть + щоб вивести всіх депутатів Верховної ради\n" +
                                    "Введіть < щоб вийти із програми\n" +
                                    ": ");
    }

    protected static Boolean choiceChapter(){
        Boolean program = true;
        String chapter = Input.getString();
        switch (chapter.trim()){
            case "1":{
                VR.getOne().addFraction();
                break;
            }case "2":{
                Fraction temp = VR.getOne().choiceFraction();
                if (temp != null)
                    VR.getOne().delFraction(temp);
                break;
            }case "3":{
                VR.getOne().viewAllFractions();
                break;
            }case "4":{
                Fraction temp = VR.getOne().choiceFraction();
                if (temp != null)
                    temp.clearFraction();
                break;
            }case "5":{
                Fraction temp = VR.getOne().choiceFraction();
                if (temp != null)
                    temp.viewDeputyFraction();
                break;
            }case "6":{
                Fraction temp = VR.getOne().choiceFraction();
                if (temp != null){
                    Deputy deputy = VR.getOne().choiceDeputy();
                    if (deputy != null)
                        temp.addDeputyInFraction(deputy);
                }
                break;
            }case "7":{
                Fraction temp = VR.getOne().choiceFraction();
                if (temp != null){
                    Deputy deputy = VR.getOne().choiceDeputy();
                    if (deputy != null)
                        temp.delDeputyFromFraction(deputy);
                }
                break;
            }case "8":{
                Fraction temp = VR.getOne().choiceFraction();
                if (temp != null)
                    temp.viewAllKhabar();
                break;
            }case "9":{
                Fraction temp = VR.getOne().choiceFraction();
                if (temp != null)
                    temp.theBigestKhabar();
                break;
            }case "0": {
                Deputy deputy = VR.getOne().choiceDeputy();
                if (deputy != null)
                    deputy.givKhabar();
                break;
            }case "+":{
                VR.getOne().viewDeputies();
                break;
            }case "<":{
                program = false;
                break;
            }default:{
                System.out.println("Спробуйте знову");
            }
        }
        return program;
    }

























}
