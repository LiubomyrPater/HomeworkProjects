package Thread;

import java.util.ArrayList;
/**
        Створити клас MyThread наслідувати його від класу Thread.
        Перевизначити метод run(), так щоб можна було вивести введену з консолі кількість чисел Фібоначі.
        Для цього використовуємо в методі run() клас Scanner.
        Тобто ми вводимо з консолі скільки ми хочемо бачити чисел Фібоначі і ми їх виводимо з затримкою в 1 секунду.
*/
public class MyThread extends Thread{

    @Override
    public void run(){

        ArrayList<Long> fibonnachi = Fibonnachi.get();

        for (Long e : fibonnachi) {
            System.out.print(e + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }
}
