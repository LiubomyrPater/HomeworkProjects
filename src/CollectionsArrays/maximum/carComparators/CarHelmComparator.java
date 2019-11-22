package CollectionsArrays.maximum.carComparators;

import CollectionsArrays.maximum.Car;

import java.util.Comparator;

public class CarHelmComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getHelm().compareTo(o2.getHelm());
    }
}
