package SetQueue.set;

import java.util.Comparator;

public class SomeClassStringComparator implements Comparator<SomeClass> {
    @Override
    public int compare(SomeClass o1, SomeClass o2) {
        return o1.getSomeString().compareTo(o2.getSomeString());
    }
}
