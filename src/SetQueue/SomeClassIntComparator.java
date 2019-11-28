package SetQueue;

import java.util.Comparator;

public class SomeClassIntComparator implements Comparator<SomeClass> {
    @Override
    public int compare(SomeClass o1, SomeClass o2) {
        return o1.getSomeInteger().compareTo(o2.getSomeInteger());
    }
}
