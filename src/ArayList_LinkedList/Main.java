package ArayList_LinkedList;

import ArayList_LinkedList.myArrayList.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList test = new MyArrayList();
        test.add(1);
        test.add(1);
        test.add(54);
        test.add(1);
        test.add(1);
        test.add(1);
        test.add(7);
        test.add(1);
        test.add(1);
        test.add(1);
        test.add(1);
        test.add(1);

        test.remove(7);

        System.out.println(test.get(5));
        System.out.println(test.size());
        for (Object x: test.toArray()) {
            System.out.println(x);
        }

    }
}
