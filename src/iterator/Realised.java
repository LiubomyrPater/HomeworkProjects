package iterator;

import service.Input;

public abstract class Realised {

    public static void printMainMenu(){
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
                                    "Введіть 0 щоб вивести найбільшого хабарника у фракції\n" +
                                    "Введіть < щоб вийти із програми\n" +
                                    ": ");
    }

    public static void choiceChapter(){
        String chapter = Input.getScannerTrueValue(Input.VariableTypes.STRING);
        switch (chapter.trim()){
            case "1":{
                break;
            }case "2":{
                break;
            }case "3":{
                break;
            }case "4":{
                break;
            }case "5":{
                break;
            }case "6":{
                break;
            }case "7":{
                break;
            }case "8":{
                break;
            }case "9":{
                break;
            }case "0":{
                break;
            }case "<":{
                System.exit(0);
            }default:{
                System.out.println("Спробуйте знову");
                choiceChapter();
            }
        }
    }

    private static Fraction choiceFraction(){
        return new Fraction("saddsa");
    }


    private static Deputy choiceDeputy(){
        return new Deputy("sd","sd",65,86,85,true);
    }























}
