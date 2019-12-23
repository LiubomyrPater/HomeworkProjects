package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
        4. Виконайте попереднє завдання використовуючи різні типи ExecutorServices
*/
public class Main {
    public static void main(String[] args) throws InterruptedException {

        //1.
        System.out.println("//1.");
        Thread.sleep(400);
        Fibonnachi.input();
        MyThread myThread = new MyThread();
        myThread.run();
        System.out.println("\n================\n");
        Thread.sleep(800);

        //2.
        System.out.println("//2.");
        Thread.sleep(400);
        RunnableThread runnableThread = new RunnableThread();
        runnableThread.run();
        System.out.println("\n================\n");
        Thread.sleep(800);

        //3.
        System.out.println("//3.");
        Thread.sleep(400);
        myThread.start();
        Thread.sleep(300);
        Thread thread = new Thread(runnableThread);
        thread.start();

        myThread.join();
        thread.join();

        System.out.println("\n================\n");

        //4.тут щось не так
        System.out.println("//4.");
        Thread.sleep(400);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(myThread);

        executorService.submit(runnableThread);
        executorService.shutdown();
    }
}
