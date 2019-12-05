package SetQueue.commodity;

import java.util.Comparator;

public class CommodityComparators {

    public static class NameComparator implements Comparator<Commodity> {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    }

    public static class WeightComparator implements Comparator<Commodity> {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.getWeight().compareTo(o2.getWeight());
        }
    }

    public static class WidthComparator implements Comparator<Commodity> {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.getWidth().compareTo(o2.getWidth());
        }
    }

    public static class LendthComparator implements Comparator<Commodity> {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.getLength().compareTo(o2.getLength());
        }
    }
}