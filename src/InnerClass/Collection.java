package InnerClass;

/**
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

public class Collection {

    private Number[] numbers;
    private InnerFirst innerFirst;
    private InnerSecond innerSecond;

    public Collection(Number[] numbers) {
        this.numbers = numbers;
        this.innerFirst = new InnerFirst();
        this.innerSecond = new InnerSecond();
    }

    public void setNumbers(Number[] numbers) {
        this.numbers = numbers;
        this.innerFirst = new InnerFirst();
        this.innerSecond = new InnerSecond();
    }

    public Number[] getNumbers() {
        return numbers;
    }

    public InnerFirst getInnerFirst() {
        return innerFirst;
    }

    public InnerSecond getInnerSecond() {
        return innerSecond;
    }


    class InnerFirst implements Iterator{

        private int point = -1;

        @Override
        public Number next() {
            point ++;
            if (point % 2 == 0){
                numbers[point] = 0;
            }
            return numbers[point];
        }

        @Override
        public Boolean hasNext() {
            return (point + 1) < numbers.length;
        }
    }

    class InnerSecond implements Iterator{

        private int point = numbers.length + 1;

        @Override
        public Boolean hasNext() {
            return point > 1;
        }

        @Override
        public Number next() {
            point -= 2;
            return numbers[point];
        }
    }

/*
    public static class Static implements Iterator{

        private int point = -1;

        @Override
        public Number next() {
            point ++;

            return numbers[point];
        }

        @Override
        public Boolean hasNext() {
            return null;
        }
    }*/

}
