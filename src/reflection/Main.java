package reflection;

//        1. Створити довільний клас, описати його. Створити в мейн його екземпляр, дослідити всю інформацію про цього.

//        2. Перезапишіть значення поля класу за допомогою рефлексії.

//        3. Створіть і викличте методи myMethod(String a, int ... args) та myMethod(String … args) за допомогою рефлексії.

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException{

        //1.
        Any instance = new Any("Qwerty", 15, true);

        System.out.println("\n" + instance + " : " + instance.getName() + " - " + instance.getCount() + " - " + instance.getIs() + "\n");

        Class<?> some = instance.getClass();
        System.out.println("CLASS NAME: " + some.getCanonicalName() + "\n" + "PACKAGE: " + some.getPackageName());

        Field[] fields = some.getDeclaredFields();
        Method[] methods = some.getMethods();
        Constructor[] constructors = some.getConstructors();

        System.out.println("FIELDS: " + Arrays.toString(fields) + "\n" + "METHODS: " + Arrays.toString(methods) + "\n" + "CONSTRUCTORS: " + Arrays.toString(constructors) + "\n");

        //2.
        Field name = instance.getClass().getDeclaredField("name");
        name.setAccessible(true);
        name.set(instance, "Abra-cad-abrA");

        Field count = instance.getClass().getDeclaredField("count");
        count.setAccessible(true);
        count.set(instance, 30);

        Field is = instance.getClass().getDeclaredField("is");
        is.setAccessible(true);
        is.set(instance, false);

        System.out.println(instance + " : " + instance.getName() + " - " + instance.getCount() + " - " + instance.getIs() + "\n");

        //3.


    }
}
