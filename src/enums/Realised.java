package enums;

import java.util.Scanner;

public abstract class Realised {

    public static Months findMonth(String temp) throws MyEnumException{
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

    private static void isMonth(){
        System.out.println("Такий місяць існує!");
    }

    private static void sameSeasonMonth(Months temp){
        String season = temp.getSeasons().toString();
        for (Months x: Months.values()){
            if (x.getSeasons().toString().equals(season)){
                System.out.print(x + " ");
            }
        }
    }

    private static void sameDaysMonth(Months temp){
        System.out.println(temp.getDays());
        for (Months x: Months.values()){
            if (x.getDays() == temp.getDays()){
                System.out.print(x + " ");
            }
        }
    }

    private static void lessDaysMonth(Months temp){
        System.out.println(temp.getDays());
        for (Months x: Months.values()){
            if (x.getDays() < temp.getDays()){
                System.out.print(x + " ");
            }
        }
    }

    private static void biggerDaysMonth(Months temp){
        System.out.println(temp.getDays());
        for (Months x: Months.values()){
            if (x.getDays() > temp.getDays()){
                System.out.print(x + " ");
            }
        }
    }

    private static void nextSeason(Months temp){
        if(temp.getSeasons().ordinal() == 3){
            System.out.println(Seasons.WINTER.toString());
        }else {
            System.out.println(Seasons.values()[temp.getSeasons().ordinal() + 1]);
        }
    }

    private static void previousSeason(Months temp){
        if(temp.getSeasons().ordinal() == 0){
            System.out.println(Seasons.FALL.toString());
        }else {
            System.out.println(Seasons.values()[temp.getSeasons().ordinal() - 1]);
        }
    }

    private static void eveningDays(){
        for (Months x: Months.values()){
            if (x.getDays()%2 == 0){
                System.out.print(x.toString() + " ");
            }
        }
    }

    private static void oddDays(){
        for (Months x: Months.values()){
            if (x.getDays()%2 != 0){
                System.out.print(x.toString() + " ");
            }
        }
    }

    private static void isEveningDaysMonth(Months temp){
        if (temp.getDays()%2 == 0){
            System.out.println(temp.toString() + " парний!");
        }else {
            System.out.println(temp.toString() + " непарний!");
        }
    }

    private static void printMenu(){
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
                        "< - Вихід з програми\n" +
                        "=======================\n" +
                        "Оберіть, будь ласка, пункт меню: ");

    }

    public static int menu(Scanner input){
        while (true){
            printMenu();
            String choice = input.next();
            if (choice.matches("[1234567890<]")){
                if (!choice.matches("[<]")){
                    return Integer.valueOf(choice);
                }else {
                    System.exit(0);
                }
            }else {
                System.out.println("Неіснуючий пункт меню!");
            }
        }
    }

    public static void programChapter(int chapter, Months months){
        switch (chapter) {
            case 1: {
                isMonth();
                break;
            }
            case 2: {
                sameSeasonMonth(months);
                break;
            }
            case 3: {
                sameDaysMonth(months);
                break;
            }
            case 4: {
                lessDaysMonth(months);
                break;
            }
            case 5: {
                biggerDaysMonth(months);
                break;
            }
            case 6: {
                nextSeason(months);
                break;
            }
            case 7: {
                previousSeason(months);
                break;
            }
            case 8: {
                eveningDays();
                break;
            }
            case 9: {
                oddDays();
                break;
            }
            case 0: {
                isEveningDaysMonth(months);
                break;
            }
        }
    }
}
