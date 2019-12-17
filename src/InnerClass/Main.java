package InnerClass;
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

        Collection  temp = new Collection(new Integer[]{5,6,89,9,5,4,3,5});


        while (Collection.One.hasNext()){
            System.out.println(Collection.One.next());
        }
    }
}