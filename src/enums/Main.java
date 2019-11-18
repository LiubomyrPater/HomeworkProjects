package enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try(input){
            Realised.printMainMenu();
            String choice = input.next();
            switch (choice){
                case "1":{
                    Realised.isMonth(Realised.findMonth());
                    break;
                }case "2":{
                    Realised.sameSeasonMonth(Realised.findMonth());
                    break;
                }case "3":{
                    Realised.sameDaysMonth(Realised.findMonth());
                    break;
                }case "4":{
                    Realised.lessDaysMonth(Realised.findMonth());
                    break;
                }case "5":{
                    Realised.biggerDaysMonth(Realised.findMonth());
                    break;
                }case "6":{
                    Realised.nextSeason(Realised.findMonth());
                    break;
                }case "7":{
                    Realised.previousSeason(Realised.findMonth());
                    break;
                }case "8":{
                    Realised.eveningDays();
                    break;
                }case "9":{
                    Realised.oddDays();
                    break;
                }case "0":{
                    Realised.isEveningDaysMonth(Realised.findMonth());
                    break;
                }default:{
                    System.out.println("Неіснуючий пункт меню! Спробуйте щераз\n" + "--------------------");
                }
            }
        }catch (MyEnumException m){
            System.out.println(m.getMessage());
        }
        main(args);
    }
}
