package iterator;

public abstract class Realised {

    public static void prinMainMenu(){
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

    }

    private static Fraction choiceFraction(){
        return new Fraction("saddsa");
    }


    private static Deputy choiceDeputy(){
        return new Deputy("sd","sd",65,86,85,true);
    }























}
