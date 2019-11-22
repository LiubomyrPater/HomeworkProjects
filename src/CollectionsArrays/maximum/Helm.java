package CollectionsArrays.maximum;
// Кермо володіє полями :
// Діаметр колеса, матеріал з якого зроблено кермо (шкіра, алькантара).

import java.util.Random;

public class Helm implements Comparable<Helm>{
    private Integer diametr;
    private Material material;

    public Helm(Random random) {
        this.diametr = (random.nextInt(10) + 30);
        if (random.nextInt(2) == 1){
            this.material = Material.ALKANTARA;
        }else {
            this.material = Material.LEATHER;
        }
    }

    public Integer getDiametr() {
        return diametr;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public int compareTo(Helm o) {
        if (this.getDiametr().equals(o.getDiametr())){
            return this.getMaterial().compareTo(o.getMaterial());
        }else {
            return this.getDiametr() - o.getDiametr();
        }
    }

    @Override
    public String toString() {
        return "{" +
                "diametr " + diametr +
                ", material " + material +
                '}';
    }
}
