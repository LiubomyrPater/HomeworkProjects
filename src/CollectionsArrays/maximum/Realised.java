package CollectionsArrays.maximum;

import CollectionsArrays.maximum.carComparators.CarEngineComparator;
import CollectionsArrays.maximum.carComparators.CarHelmComparator;
import CollectionsArrays.maximum.carComparators.CarYearComparator;
import java.util.*;

//    Створити консольне меню, яке буде мати наступні елементи меню:
//    а) Вивести toString() даних елементів масиву на консоль. ( deepToString() )
//    б) Для всіх обєктів даного масиву засетати одне значення будьякого поля класу Авто (fill())
//    в) відсортувати за спаданням всі обєкти за введеним полем
//    г) відсортувати за зростанням всі обєкти за введеним полем


public abstract class Realised {

    private static Car[][] sortByAny(Car [][] cars, boolean upDown, Comparator comparator){
        if (upDown){
            for (int i = 0; i <cars.length ; i++) {
                Arrays.sort(cars[i], comparator);
            }
        }else {
            for (int i = 0; i <cars.length ; i++) {
                Arrays.sort(cars[i], Collections.reverseOrder(comparator));
            }
        }
        return cars;
    }

    public static void mainMenu(Scanner scanner, Car[][] cars, Random random){
        while (true){
            System.out.print("\n" + "Choice, please - " + "\n" +
                    "1) Print all array" + "\n" +
                    "2) Same field" + "\n" +
                    "3) Sorting in descending order by any field" + "\n" +
                    "4) Sorting in ascending order by any field" + "\n" +
                    "<  for exit" + "\n" +
                    ": ");
            String chapter = scanner.next();
            if (chapter.matches("[1234<]")){
                if (chapter.matches("[<]")){
                    System.exit(0);
                }else {
                    choiceMenu(Integer.valueOf(chapter), cars, scanner, random);
                }
            }else {
                System.out.println("Only: 1 2 3 4");
            }
        }
    }

    private static Comparator choiceField(Scanner scanner){

        while (true){
            scanner.reset();
            System.out.print("Input name of field for sorting (engine  helm  year): ");
            String field = scanner.next();
            if (field.matches("engine")){
                return new CarEngineComparator();
            }else if (field.matches("helm")){
                return new CarHelmComparator();
            }else if (field.matches("year")){
                return new CarYearComparator();
            }else{
                System.out.println("Try again");
            }
        }
    }

    private static void theSameValue(Car[][] cars, Random random){
        for (int i = 0; i <cars.length ; i++) {
            Arrays.fill(cars[i], new Car(random, 1900));
        }
    }

    private static void choiceMenu(int chapter, Car[][] cars, Scanner scanner, Random random){
        switch (chapter){
            case 1:{
                System.out.println(Arrays.deepToString(cars));
                break;
            }case 2:{
                theSameValue(cars, random);
                break;
            }case 3:{
                Car[][] cars1 = sortByAny(cars, true, choiceField(scanner));
                System.out.println(Arrays.deepToString(cars1));
                break;
            }case 4:{
                Car[][] cars1 = sortByAny(cars, false, choiceField(scanner));
                System.out.println(Arrays.deepToString(cars1));
                break;
            }
        }
    }
}
