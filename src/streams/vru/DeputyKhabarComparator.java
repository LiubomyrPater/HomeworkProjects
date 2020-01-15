package streams.vru;

import java.util.Comparator;

public class DeputyKhabarComparator implements Comparator<Deputy> {
    @Override
    public int compare(Deputy o1, Deputy o2) {
        return o1.getValueKhabar() - o2.getValueKhabar();
    }
}
