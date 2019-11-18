package enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try{
            while (true){
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
                                "Choice, please: ");

                Scanner input = new Scanner(System.in);
                String choice = input.next();
                switch (choice){
                    case "1":{
                        Realised.isMonth();
                        break;
                    }case "2":{
                        Realised.sameSeasonMonth();
                        break;
                    }case "3":{
                        Realised.sameDaysMonth();
                        break;
                    }case "4":{
                        Realised.lessDaysMonth();
                        break;
                    }case "5":{
                        Realised.biggerDaysMonth();
                        break;
                    }case "6":{
                        Realised.nextSeason();
                        break;
                    }case "7":{
                        Realised.previousSeason();
                        break;
                    }case "8":{
                        Realised.eveningDays();
                        break;
                    }case "9":{
                        Realised.oddDays();
                        break;
                    }case "0":{
                        Realised.isEveningDaysMonth();
                        break;
                    }default:{
                        System.out.println("Something wrong! Try again\n" + "--------------------");
                    }
                }
            }
        }catch (MyEnumException m){
            System.out.println(m.getMessage());
            main(args);
        }
    }
}
