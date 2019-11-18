package enums;

import java.util.Scanner;

public class Realised {

    public static Months findMonth() throws MyEnumException{
        System.out.print("\n" + "Введіть, будь ласка, назву місяця: ");
        Scanner input = new Scanner(System.in);
        String temp = input.next();
        Months month = Months.JANUARY;
        boolean is = false;
        for (Months x: Months.values()){
            if (temp.equalsIgnoreCase(x.toString())){
                is = true;
                month = x;
            }
        }
        if (is){
            return month;
        }else {
            throw new MyEnumException("Такого місяця не існує!!!");
        }
    }

    public static void isMonth(Months temp)throws MyEnumException{
        System.out.println("Такий місяць існує!");
    }

    public static void sameSeasonMonth(Months temp)throws MyEnumException{
        String season = temp.getSeasons().toString();
        for (Months x: Months.values()){
            if (x.getSeasons().toString().equals(season)){
                System.out.print(x + " ");
            }
        }
    }

    public static void sameDaysMonth(Months temp)throws MyEnumException{
        System.out.println(temp.getDays());
        for (Months x: Months.values()){
            if (x.getDays() == temp.getDays()){
                System.out.print(x + " ");
            }
        }
    }

    public static void lessDaysMonth(Months temp)throws MyEnumException{
        System.out.println(temp.getDays());
        for (Months x: Months.values()){
            if (x.getDays() < temp.getDays()){
                System.out.print(x + " ");
            }
        }
    }

    public static void biggerDaysMonth(Months temp)throws MyEnumException{
        System.out.println(temp.getDays());
        for (Months x: Months.values()){
            if (x.getDays() > temp.getDays()){
                System.out.print(x + " ");
            }
        }
    }

    public static void nextSeason(Months temp)throws MyEnumException{
        if(temp.getSeasons().ordinal() == 4){
            System.out.println(Seasons.WINTER.toString());
        }else {
            System.out.println(Seasons.values()[temp.getSeasons().ordinal() + 1]);
        }
    }

    public static void previousSeason(Months temp)throws MyEnumException{
        if(temp.getSeasons().ordinal() == 1){
            System.out.println(Seasons.FALL.toString());
        }else {
            System.out.println(Seasons.values()[temp.getSeasons().ordinal() - 1]);
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

    public static void isEveningDaysMonth(Months temp)throws MyEnumException{
        if (temp.getDays()%2 == 0){
            System.out.println(temp.toString() + " парний!");
        }else {
            System.out.println(temp.toString() + " непарний!");
        }
    }

    public static void printMainMenu(){
        System.out.print(
                "\n" +
                        "1 - Перевірити чи є такий місяць\n" +
                        "2 - Вивести всі місяці з такою ж порою року\n" +
                        "3 - Вивести всі місяці які мають таку саму кількість днів\n" +
                        "4 - Вивести на екран всі місяці які мають меншу кількість днів\n" +
                        "5 - Вивести на екран всі місяці які мають більшу кількість днів\n" +
                        "6 - Вивести на екран наступну пору року\n" +
                        "7 - Вивести на екран попередню пору року\n" +
                        "8 - Вивести на екран всі місяці які мають парну кількість днів\n" +
                        "9 - Вивести на екран всі місяці які мають непарну кількість днів\n" +
                        "0 - Вивести на екран чи введений з консолі місяць має парну кількість днів\n" +
                        "=======================\n" +
                        "Оберіть, будь ласка, пункт меню: ");

    }
}
