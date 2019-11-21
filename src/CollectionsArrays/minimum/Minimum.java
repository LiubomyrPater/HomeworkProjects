package CollectionsArrays.minimum;

import java.util.Arrays;
import java.util.Collections;

public class Minimum {

    private Integer[] arrayInteger;

    public Minimum() {
        this.arrayInteger = new Integer[(int) (Math.random() * 21 + 20)];
        for (int i = 0; i < this.arrayInteger.length; i++) {
            this.arrayInteger[i] = (int) (Math.random() * 201 - 100);
        }
    }

    public Integer[] getArrayInteger() {
        return arrayInteger;
    }

    public Integer[] sortingInAscendingOrder(){
        Integer[] sorted = arrayInteger.clone();
        Arrays.sort(sorted);
        return sorted;
    }

    public Integer[] sortByDescending(){
        Integer[] sorted = arrayInteger.clone();
        Arrays.sort(sorted,Collections.reverseOrder());
        return sorted;
    }
}
