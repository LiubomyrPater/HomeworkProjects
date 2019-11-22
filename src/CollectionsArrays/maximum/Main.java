package CollectionsArrays.maximum;

import CollectionsArrays.maximum.carComparators.CarYearComparator;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

//    План максимум:
//-----------------------------------------------------------------------------------------------
//    Створити сутністності Авто, Кермо, Двигун.

//    Створити двовимірний масив, величина якого вираховується рандомно.

//    Заповнити даний масив обєктами авто, всі значення конструктора якого заповнюються рандомно.



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Car[][] cars = new Car[random.nextInt(10) + 10][];
        for (int i = 0; i < cars.length ; i++) {
            cars[i] = new Car[random.nextInt(5) + 10];
            for (int j = 0; j <cars[i].length ; j++) {
                cars[i][j] = new Car(random);
            }
        }
        Realised.mainMenu(scanner, cars, random);
    }
}
