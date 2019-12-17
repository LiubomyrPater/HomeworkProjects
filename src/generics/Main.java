package generics;

import java.util.*;
/**
        1. Зробіть так, щоб в List<Integer> можна було додати об’єкт типу String.
           І поясніть чому так можна зробити, якщо це взагалі можливо?
           (Це слід зробити виключно використовуючи існуючий List та його generics)

        2. Створити клас MyEntry<K,V>.
           Описати в ньому дженеріками – поля, гетери/сетери, toString.

        3. Створити клас Map<K,V>. Реалізвати в даному класі методи, які б:
           Додавали новий об’єкт в мапу
           Видаляли об’єкт мапи за ключем
           Видаляли об’єкт мапи за значенням
           Виводили на екран Set ключів
           Виводили на екран List значень
           Виводили на екран цілу мапу
*/
public class Main {
    public static void main(String[] args) {

        //1.
        List<String> stringList = Collections.singletonList("HA-HA");
        List<Integer> integerList = new ArrayList(stringList); //щоб засунути List<String> я забрав diamond
        integerList.add(777);
        System.out.println("//1.\nFIRST  element: " + integerList.get(0) + "\nSECOND element: " + integerList.get(1) + "\n");

        List<Integer> list = new ArrayList<>(integerList); //а тут, навіть, з diamond вдалось
        list.add(1234567);
        System.out.println("FIRST  element: " + list.get(0) + "\nSECOND element: " + list.get(1) + "\nTHIRD  element: " + list.get(2));


        //2.
        MyEntry<String, Integer> myEntry = new MyEntry<>();
        myEntry.setSome("qwerty");
        myEntry.setAny(123);
        System.out.println("\n//2.\n" + myEntry.getAny() + " " + myEntry.getSome());
        System.out.println(myEntry.toString());


        //3.
        /*generics.Map<Integer, String> integerStringMap = new generics.Map<>();
        System.out.println("----------------------------");
        integerStringMap.put(5,"FIVE");
        integerStringMap.put(6,"SIX");
        integerStringMap.put(7,"SEVEN");
        integerStringMap.put(8,"EIGHT");
        integerStringMap.put(9,"NINE");
        integerStringMap.put(0,"ZERO");

        System.out.println("\n//3.\nKEY SET:\n" + integerStringMap.keySet() + "\n");

        System.out.println("LIST VALUE:\n" + integerStringMap.valueList() + "\n");

        System.out.println("ALL MAP:\n" + integerStringMap.allMap());

        integerStringMap.put(5,"EIGHT");

        //integerStringMap.removeByKey(6);

        //integerStringMap.removeByValue("not done");

        System.out.println("ALL MAP:\n" + integerStringMap.allMap());*/
    }
}
