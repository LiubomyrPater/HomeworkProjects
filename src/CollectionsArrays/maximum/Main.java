package CollectionsArrays.maximum;

import CollectionsArrays.maximum.carComparators.CarYearComparator;

import java.util.Arrays;
import java.util.Random;

public class Main {

//    План максимум:
//-----------------------------------------------------------------------------------------------
//    Створити сутністності Авто, Кермо, Двигун.

//    Створити двовимірний масив, величина якого вираховується рандомно.

//    Заповнити даний масив обєктами авто, всі значення конструктора якого заповнюються рандомно.

//    Створити консольне меню, яке буде мати наступні елементи меню:
//    а) Вивести toString() даних елементів масиву на консоль. ( deepToString() )
//    б) Для всіх обєктів даного масиву засетати одне значення будьякого поля класу Авто (fill())
//    в) відсортувати за спаданням всі обєкти за введеним полем
//    г) відсортувати за зростанням всі обєкти за введеним полем

    public static void main(String[] args) {

        Random random = new Random();

        Car[][] cars = new Car[random.nextInt(10) + 10][];
        for (int i = 0; i < cars.length ; i++) {
            cars[i] = new Car[random.nextInt(5) + 10];
            for (int j = 0; j <cars[i].length ; j++) {
                cars[i][j] = new Car(random);
            }
        }




        System.out.println(Arrays.deepToString(cars));
        Arrays.sort(cars[0], new CarYearComparator());
        System.out.println(Arrays.deepToString(cars));


    }
}
