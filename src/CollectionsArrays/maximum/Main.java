package CollectionsArrays.maximum;

import CollectionsArrays.maximum.carComparators.CarYearComparator;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<List> cars = new ArrayList<>();
        for (int i = 0; i <(random.nextInt(5) + 5) ; i++) {
            cars.add(new ArrayList());
        }
        for (int j = 0; j <cars.size() ; j++) {
            for (int i = 0; i <(random.nextInt(5) + 5) ; i++) {
                cars.get(j).add(new Car(random));
            }
        }
        Realised.mainMenuList(scanner, cars, random);





//реалізація через двовтмірний масив
/*
        Car[][] cars = new Car[random.nextInt(10) + 10][];
        for (int i = 0; i < cars.length ; i++) {
            cars[i] = new Car[random.nextInt(5) + 10];
            for (int j = 0; j <cars[i].length ; j++) {
                cars[i][j] = new Car(random);
            }
        }
        Menu.mainMenu(scanner, cars, random);*/
    }
}
