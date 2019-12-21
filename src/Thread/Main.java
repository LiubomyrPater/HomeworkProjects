package Thread;
/**
        Мінімум:
        1. Створити потік.
        Створити клас MyThread наслідувати його від класу Thread.
        Перевизначити метод run(), так щоб можна було вивести введену з консолі кількість чисел Фібоначі.
        Для цього використовуємо в методі run() клас Scanner.
        Тобто ми вводимо з консолі скільки ми хочемо бачити чисел Фібоначі і ми їх виводимо з затримкою в 1 секунду.

        2. Створити потік.
        Створити клас RunnableThread імплементувати його від інтерфейсу Runnable.
        Метод run() перевизначити таким чином, щоб числа Фібоначі виводились в зворотньому порядку.
        Тобто Спершу ввели через Scanner скільки ми хочемо бачити чисел Фібоначі,
        потім з затримкою в 1 секунду вивести їх від останнього до першого значення.

        3. Перший і другий потоки повинні виводити в один рядок числа.
        Вигляд на консолі:
        Потік Thread : 1 1 2 3 5 . . .
        Потік Runnable: . . .5 3 2 1 1

        Максимум:
        Виконайте попереднє завдання використовуючи різні типи ExecutorServices
*/
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Fibonnachi.input();
        //1.
        System.out.println("//1.");
        Thread.sleep(500);
        MyThread myThread = new MyThread();
        myThread.run();

        System.out.println("\n================\n");
        Thread.sleep(1000);

        //2.
        System.out.println("//2.");
        Thread.sleep(500);
        RunnableThread runnableThread = new RunnableThread();
        Fibonnachi.input();
        runnableThread.run();

        System.out.println("\n================\n");
        Thread.sleep(1000);
        /*MyThread myThread = new MyThread();
        RunnableThread runnableThread = new RunnableThread();*/
        //3.
        System.out.println("//3.");
        Thread.sleep(500);
        myThread.run();
        runnableThread.run();

    }
}
