package SetQueue;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
//    1) Створити клас (довільно який),
//    описати в ньому мінімум два поля,
//    одне з яких String,
//    інше числове (довільно яке).
//
//    Створити в мейн методі Set.
//    Наповнити його обєктами даного класу.
//    Використати Comparator і Comparable для сортування за цими полями.
//    Вивести спершу невідсортований список,
//    потім відсортований на консоль.

//    2) Створити клас Commodity.
//    Описати даний клас: поля методи.
//    Повинні бути такі методи:
//    Додати товар
//    Видалити товар
//    Замінити товар
//    Сортувати за назвоню
//    Сортувати за довжиною
//    Сортувати за шириною
//    Сортувати за вагою
//    Виводимо і-тий елемент колекції(який ми вводимо з консолі(використовуємо Scanner))
//    Вийти з програми(підказка System.exit)
//
//    Для меню використати Switch.
//    Продемонструвати як виконується кожен метод над списком і
//    виводити список після змін в ньому.

    public static void main(String[] args) {
        Random random = new Random();
        Set<SomeClass> someClassSet = new HashSet<>();
        for (int i = 0; i <20 ; i++) {
            someClassSet.add(new SomeClass(random));
        }

        System.out.println("Custom order in HashSet: \n" + someClassSet + "\n");

        TreeSet<SomeClass> someClassTreeSet = new TreeSet<>(someClassSet);

        System.out.println("Implemented Comparable: \n" + someClassTreeSet + "\n");

        Set<SomeClass> someClassTreeSet1 = new TreeSet<>(new SomeClassIntComparator());

        someClassTreeSet1.addAll(someClassTreeSet);

        System.out.println("Comparator by Integer: \n" + someClassTreeSet1);

        Set<SomeClass> someClassTreeSet2 = new TreeSet<>(new SomeClassStringComparator());

        someClassTreeSet2.addAll(someClassTreeSet);

        System.out.println("Comparator by String: \n" + someClassTreeSet2);

    }
}
