package InnerClass;

import java.util.Arrays;
/**
        Створити інтерфейс Iterator, в якому оголосити метод hasNext(), next().
        Створити клас Collection, в якого оголосити як поле масив типу Number.
        Створити конструктор з визначеними параметрами куди передати даний масив.
        Створити два внутрішніх класи, які імплементуватимуть інтерфейс Iterator.

        1. Перевизначити методи так щоб:

        -  Першого класу виводили значення масиву від першого до останнього.
           Зробити заміну непарних елементів на нуль і вивести на екран даний масив.

        -  Другого класу виводили від останнього до першого значення через одну цифру.

        2. Створити анонімний клас який повинен: прогнати від останнього до першого елементу масиву.
           Перевірити кожен третій елемент масиву від останнього чи він непарний, якщо так то вивести дані елементи на консоль.

        3. Створити Локальний клас який повинен: пройтись від першого до останнього елементу масиву,
           перевірити кожен п’ятий елемент масиву, якщо він парний то відняти від нього число 100, і вивести на консоль ці числа.

        4. Створити статичний клас який повинен: пройтись від першого до останнього елемента масиву.
           Перевірити кожен другий елемент масив на парність, якщо він парний, тоді зробити з нього непарний і вивести дані елементи на консоль.
 */
public class Main {
    public static void main(String[] args) {

        Collection temp = new Collection(new Integer[]{5,6,89,9,5,4,3,7});

        System.out.println("\n1. ===========================================================");
        System.out.println("Заміна непарних елементів на нуль");
        System.out.println(Arrays.toString(temp.getNumbers()));

        while (temp.getInnerFirst().hasNext()){
            System.out.println(temp.getInnerFirst().next());
        }
/////////////////////////////////////////////////////////////////////////////////////


        temp.setNumbers(new Integer[]{5,6,89,9,5,4,3,7,99,777,8888,99999});

        System.out.println("\nВведення від останнього до першого значення через одну цифру");
        System.out.println(Arrays.toString(temp.getNumbers()));

        while (temp.getInnerSecond().hasNext()){
            System.out.println(temp.getInnerSecond().next());
        }
////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("\n2. ===========================================================");
        System.out.println("Прогнати від останнього до першого елементу масиву.\n" +
                "Перевірити кожен третій елемент масиву від останнього чи він непарний,\n" +
                "якщо так то вивести дані елементи на консоль");
        System.out.println(Arrays.toString(temp.getNumbers()));

        Iterator iterator = new Iterator(){

            int point = temp.getNumbers().length + 2;

            @Override
            public Boolean hasNext() {
                return point > 2;
            }

            @Override
            public Number next() {
                point -= 3;
                return temp.getNumbers()[point];
            }

        };

        while (iterator.hasNext()){
            Number x = iterator.next();
            if (x.intValue() % 2 != 0)
            System.out.println(x);
        }
////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("\n3. ===========================================================");
        System.out.println("Створити Локальний клас який повинен: пройтись від першого до останнього елементу масиву,\n" +
                "перевірити кожен п’ятий елемент масиву, якщо він парний то відняти від нього число 100");
        System.out.println(Arrays.toString(temp.getNumbers()));

        class Local implements Iterator{

            private int point = -5;

            @Override
            public Number next() {
                point += 5;
                return temp.getNumbers()[point];
            }

            @Override
            public Boolean hasNext() {
                return (point + 5) < temp.getNumbers().length;
            }
        }

        Local local = new Local();
        while (local.hasNext()){
            Number x = local.next();
            if (x.intValue() % 2 == 0)
            System.out.println(x.intValue() - 100);
        }
////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n4. ===========================================================");
        System.out.println("Створити статичний клас який повинен: пройтись від першого до останнього елемента масиву.\n" +
                "Перевірити кожен другий елемент масив на парність,\n" +
                "якщо він парний, тоді зробити з нього непарний");



    }

}
