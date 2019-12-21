package Thread;

import java.util.ArrayList;
/**
        Створити клас RunnableThread імплементувати його від інтерфейсу Runnable.
        Метод run() перевизначити таким чином, щоб числа Фібоначі виводились в зворотньому порядку.
        Тобто Спершу ввели через Scanner скільки ми хочемо бачити чисел Фібоначі,
        потім з затримкою в 1 секунду вивести їх від останнього до першого значення.
*/

public class RunnableThread implements Runnable {
    @Override
    public void run() {

        ArrayList<Long> fibonnachi = Fibonnachi.get();

        for (int i = fibonnachi.size()-1; i >= 0 ; i--) {
            System.out.print(fibonnachi.get(i) + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
