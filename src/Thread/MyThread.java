package Thread;

import service.Input;

import java.util.ArrayList;
import java.util.Arrays;

/**
        Створити клас MyThread наслідувати його від класу Thread.
        Перевизначити метод run(), так щоб можна було вивести введену з консолі кількість чисел Фібоначі.
        Для цього використовуємо в методі run() клас Scanner.
        Тобто ми вводимо з консолі скільки ми хочемо бачити чисел Фібоначі і ми їх виводимо з затримкою в 1 секунду.
*/
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.print("Введіть порядковий номер числа із послідовності: ");
        int number = Input.getInt();

        System.out.print("Введіть кількість чисел послідовності: ");
        int count = Input.getInt();


        long n0 = Math.round(Math.pow(((1 + Math.sqrt(5)) / 2), number) / Math.sqrt(5));  //значення довільного числа Фібоначі
        long n1 = Math.round(Math.pow(((1 + Math.sqrt(5)) / 2), number + 1) / Math.sqrt(5)); //значення наступного довільного числа Фібоначі

        ArrayList<Long> fibonnachi = new ArrayList<>();
        if (count == 1) {
            fibonnachi.add(n0);
        }else if (count <= 2){
            fibonnachi.add(n0);
            fibonnachi.add(n1);
        }else {
            fibonnachi.add(n0);
            fibonnachi.add(n1);

            long nNext;
            for (int i = 0; i < count - 2; i++){
                fibonnachi.add(nNext = n0 + n1);
                n0 = n1;
                n1 = nNext;
            }
        }




        for (int i = 0; i < fibonnachi.size(); i++) {
            System.out.print(fibonnachi.get(i) + " ");
        }
    }
}
