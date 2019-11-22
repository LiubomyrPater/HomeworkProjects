package CollectionsArrays.maximum;

import java.util.Objects;
import java.util.Random;

// Авто володіє полями :
// Кількість кінських сил, рік випуску

public class Car implements Comparable<Car>{

    private Integer year;
    private Helm helm;
    private Engine engine;

    public Car(Random random, Integer year) {
        this.year = year;
        this.helm = new Helm(random);
        this.engine = new Engine(random);
    }

    public Car(Random random) {
        this.year = (random.nextInt(70) + 1950);
        this.helm = new Helm(random);
        this.engine = new Engine(random);
    }

    public Integer getYear() {
        return year;
    }

    public Helm getHelm() {
        return helm;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(year, car.year) &&
                Objects.equals(helm, car.helm) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {

        return Objects.hash(year, helm, engine);
    }

    @Override
    public int compareTo(Car o) {
        if (this.getYear().equals(o.getYear())){
            if (this.getEngine().equals(o.getEngine())){
                return this.getHelm().compareTo(o.getHelm());
            }
            return this.getEngine().compareTo(o.getEngine());
        }
        return this.getYear().compareTo(o.getYear());
    }

    @Override
    public String toString() {
        return "Car{" +
                "year " + year +
                ", helm " + helm +
                ", engine " + engine +
                '}';
    }
}
