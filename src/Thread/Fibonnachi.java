package Thread;

import service.Input;

import java.util.ArrayList;

public abstract class Fibonnachi {

    private static int number;
    private static int count;

    public static ArrayList<Long> get(){

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
        return fibonnachi;
    }

    public static void input() throws InterruptedException {
        char[] chars1 = "Введіть порядковий номер числа із послідовності: ".toCharArray();
        for (char c: chars1){
            System.out.print(c);
            Thread.sleep(30);
        }
        number = Input.getInt();


        Thread.sleep(500);


        char[] chars2 = "Введіть кількість чисел послідовності: ".toCharArray();
        for (char c: chars2){
            System.out.print(c);
            Thread.sleep(30);
        }
        count = Input.getInt();
    }
}
