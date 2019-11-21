package CollectionsArrays.minimum;

import java.util.Arrays;

public class Main {
//    План мінімум:
//    1. Створити масив Integer, заповнити значення рандомними значеннями, відсортувати його в порядку спадання та в порядку зростання.

    public static void main(String[] args) {

        Minimum any = new Minimum();

        System.out.println("\n" + "Original: " + Arrays.toString(any.getArrayInteger()) + "\n");
        System.out.println("UP:       " + Arrays.toString(any.sortingInAscendingOrder()));
        System.out.println("Original: " + Arrays.toString(any.getArrayInteger()) + "\n");
        System.out.println("DOWN:     " + Arrays.toString(any.sortByDescending()));
        System.out.println("Original: " + Arrays.toString(any.getArrayInteger()));

    }
}
