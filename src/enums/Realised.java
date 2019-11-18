package enums;

import java.util.Scanner;

public class Realised {

    public static Months findMonth() throws MyEnumException{
        System.out.print("\n" + "Input, please: ");
        Scanner input = new Scanner(System.in);
        String temp = input.next();
        Months a = Months.NONE;
        boolean is = false;
        for (Months x: Months.values()){
            if (temp.equalsIgnoreCase(x.toString())){
                is = true;
                a = x;
            }
        }
        if (is){
            return a;
        }else {
            throw new MyEnumException("Wrong input!!!");
        }
    }

    public static void isMonth()throws MyEnumException{
        if (findMonth().equals(Months.NONE)){
            System.out.println("There is no such month!");
        }else {
            System.out.println("There is such a month!");
        }
    }

    public static void sameSeasonMonth()throws MyEnumException{
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

    public static void sameDaysMonth()throws MyEnumException{
        Months z = findMonth();
        if (!z.equals(Months.NONE)){
            System.out.println(z.getDays());
            for (Months x: Months.values()){
                if (x.getDays() == z.getDays()){
                    System.out.print(x + " ");
                }
            }
        }else {
            System.out.println("There is no such month!");
        }
    }

    public static void lessDaysMonth()throws MyEnumException{
        Months z = findMonth();
        if (!z.equals(Months.NONE)){
            System.out.println(z.getDays());
            for (Months x: Months.values()){
                if (x.getDays() < z.getDays()){
                    System.out.print(x + " ");
                }
            }
        }else {
            System.out.println("There is no such month!");
        }
    }

    public static void biggerDaysMonth()throws MyEnumException{
        Months z = findMonth();
        if (!z.equals(Months.NONE)){
            System.out.println(z.getDays());
            for (Months x: Months.values()){
                if (x.getDays() > z.getDays()){
                    System.out.print(x + " ");
                }
            }
        }else {
            System.out.println("There is no such month!");
        }
    }

    public static void nextSeason()throws MyEnumException{
        Months z = findMonth();
        if (!z.equals(Months.NONE)){
            if(z.getSeasons().ordinal() == 4){
                System.out.println(Seasons.WINTER.toString());
            }else {
                System.out.println(Seasons.values()[z.getSeasons().ordinal() + 1]);
            }
        }else {
            System.out.println("There is no such month!");
        }
    }

    public static void previousSeason()throws MyEnumException{
        Months z = findMonth();
        if (!z.equals(Months.NONE)){
            if(z.getSeasons().ordinal() == 1){
                System.out.println(Seasons.FALL.toString());
            }else {
                System.out.println(Seasons.values()[z.getSeasons().ordinal() - 1]);
            }
        }else {
            System.out.println("There is no such month!");
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

    public static void isEveningDaysMonth()throws MyEnumException{
        Months z = findMonth();
        if (!z.equals(Months.NONE)){
            if (z.getDays()%2 == 0){
                System.out.println(z.toString() + " is even!");
            }else {
                System.out.println(z.toString() + " is odd!");
            }
        }else {
            System.out.println("There is no such month!");
        }
    }
}
