package CollectionsArrays.maximum.carComparators;

import CollectionsArrays.maximum.Car;

import java.util.Comparator;

public class CarEngineComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getEngine().compareTo(o2.getEngine());
    }
}
