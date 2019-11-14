package homework8;

import java.util.Scanner;

public class Realised {

    public static Months findMonth(){
        System.out.print("\n" + "Input, please: ");
        Scanner input = new Scanner(System.in);
        String temp = input.next();
        Months a = Months.NONE;
        for (Months x: Months.values()){
            if (temp.equalsIgnoreCase(x.toString())){
                a = x;
            }
        }
        return a;
    }

    public static void isMonth(){
        if (findMonth().equals(Months.NONE)){
            System.out.println("There is no such month!");
        }else {
            System.out.println("There is such a month!");
        }
    }

    public static void sameSeasonMonth(){
        Months z = findMonth();
        if (!z.equals(Months.NONE)){
            String season = z.getSeasons().toString();
            for (Months x: Months.values()){
                if (x.getSeasons().toString().equals(season)){
                    System.out.print(x + " ");
                }
            }
        }else {
            System.out.println("There is no such month!");
        }
    }

    public static void sameDaysMonth(){
        Months z = findMonth();
        if (!z.equals(Months.NONE)){
            System.out.println(z.getDays());
            for (Months x: Months.values()){
                if (x.getDays() == z.getDays()){
                    System.out.print(x + " ");
                }
            }
        }else {
            System.out.println("There is such a month!");
        }
    }

    public static void lessDaysMonth(){
        Months z = findMonth();
        if (!z.equals(Months.NONE)){
            System.out.println(z.getDays());
            for (Months x: Months.values()){
                if (x.getDays() < z.getDays()){
                    System.out.print(x + " ");
                }
            }
        }else {
            System.out.println("There is such a month!");
        }
    }

    public static void biggerDaysMonth(){
        Months z = findMonth();
        if (!z.equals(Months.NONE)){
            System.out.println(z.getDays());
            for (Months x: Months.values()){
                if (x.getDays() > z.getDays()){
                    System.out.print(x + " ");
                }
            }
        }else {
            System.out.println("There is such a month!");
        }
    }

    public static void nextSeason(){
        Months z = findMonth();
        if (!z.equals(Months.NONE)){
            if(z.getSeasons().ordinal() == 4){
                System.out.println(Seasons.WINTER.toString());
            }else {
                System.out.println(Seasons.values()[z.getSeasons().ordinal() + 1]);
            }
        }else {
            System.out.println("There is such a month!");
        }
    }

    public static void previousSeason(){
        Months z = findMonth();
        if (!z.equals(Months.NONE)){
            if(z.getSeasons().ordinal() == 1){
                System.out.println(Seasons.FALL.toString());
            }else {
                System.out.println(Seasons.values()[z.getSeasons().ordinal() - 1]);
            }
        }else {
            System.out.println("There is such a month!");
        }
    }

    public static void eveningDays(){
        for (Months x: Months.values()){
            if (x.getDays()%2 == 0){
                System.out.print(x.toString() + " ");
            }
        }
    }

    public static void oddDays(){
        for (Months x: Months.values()){
            if (x.getDays()%2 != 0){
                System.out.print(x.toString() + " ");
            }
        }
    }

    public static void isEveningDaysMonth(){
        Months z = findMonth();
        if (!z.equals(Months.NONE)){
            if (z.getDays()%2 == 0){
                System.out.println(z.toString() + " is even!");
            }else {
                System.out.println(z.toString() + " is odd!");
            }
        }else {
            System.out.println("There is such a month!");
        }
    }
}
