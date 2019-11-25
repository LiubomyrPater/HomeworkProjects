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


    private static List sortByAnyList(List cars, boolean upDown, Comparator comparator){
        if (upDown){
            Iterator<List> cars1 = cars.iterator();
            while (cars1.hasNext()){
                cars1.next().sort(comparator);
            }
        }else {
            Iterator<List> cars1 = cars.iterator();
            while (cars1.hasNext()){
                cars1.next().sort(Collections.reverseOrder(comparator));
            }
        }
        return cars;
    }

    public static void mainMenuList(Scanner scanner, List cars, Random random){
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
                    choiceMenuList(Integer.valueOf(chapter), cars, scanner, random);
                }
            }else {
                System.out.println("Only: 1 2 3 4");
            }
        }
    }

    private static void theSameValueList(List cars, Random random){
        Iterator<List> cars1 = cars.iterator();
        while (cars1.hasNext()){
            List<Car> cars2 = cars1.next();
            cars2.clear();
            for (int i = 0; i < (random.nextInt(5) + 5) ; i++) {
                cars2.add(new Car(random, 1900));
            }
        }
    }

    public static void viewList(List cars1){
        Iterator<List> carsList = cars1.listIterator();
        while (carsList.hasNext()){
            List<Car> cars = carsList.next();
            Iterator<Car> cars2 = cars.iterator();
            while (cars2.hasNext()){
                System.out.println(cars2.next().toString());
            }
        }
    }

    private static void choiceMenuList(int chapter, List cars1, Scanner scanner, Random random){
        switch (chapter){
            case 1:{
                viewList(cars1);
                break;
            }case 2:{
                theSameValueList(cars1, random);
                break;
            }case 3:{
                List cars = sortByAnyList(cars1, true, choiceField(scanner));
                viewList(cars);
                break;
            }case 4:{
                List cars = sortByAnyList(cars1, false, choiceField(scanner));
                viewList(cars);
                break;
            }
        }
    }




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

    private static void theSameValue(Car[][] cars, Random random){
        for (int i = 0; i <cars.length ; i++) {
            Arrays.fill(cars[i], new Car(random, 1900));
        }
    }

    private static void choiceMenu(int chapter, Car[][] cars, Scanner scanner, Random random){
        switch (chapter){
            case 1:{
                for (int i = 0; i < cars.length; i++) {
                    System.out.println(Arrays.toString(cars[i]));
                }
                break;
            }case 2:{
                theSameValue(cars, random);
                break;
            }case 3:{
                Car[][] cars1 = sortByAny(cars, true, choiceField(scanner));
                for (int i = 0; i < cars1.length; i++) {
                    System.out.println(Arrays.toString(cars1[i]));
                }
                break;
            }case 4:{
                Car[][] cars1 = sortByAny(cars, false, choiceField(scanner));
                for (int i = 0; i < cars1.length; i++) {
                    System.out.println(Arrays.toString(cars1[i]));
                }
                break;
            }
        }
    }
}
