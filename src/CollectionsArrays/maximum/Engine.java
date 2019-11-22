package CollectionsArrays.maximum;

import java.util.Objects;
import java.util.Random;

// Двигун володіє полями : кількість циліндрів.
public class Engine implements Comparable<Engine>{

    private Integer cylinders;
    private Integer horspower;

    public Engine(Random random) {
        this.cylinders = (random.nextInt(3) + 2);
        this.horspower = (random.nextInt(100) + 50);
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public Integer getHorspower() {
        return horspower;
    }

    @Override
    public int compareTo(Engine o) {
        if (this.horspower.equals(o.getHorspower())){
            return this.getCylinders() - o.getCylinders();
        }else{
            return this.horspower - o.getHorspower();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(cylinders, engine.cylinders) &&
                Objects.equals(horspower, engine.horspower);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cylinders, horspower);
    }
}
