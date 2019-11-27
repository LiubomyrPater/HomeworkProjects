package iterator;

import iterator.enums.Name;
import iterator.enums.SecondName;
import java.util.Random;

public class Person {

    private Name name;
    private SecondName secondName;
    private int age;
    private int weight;
    private int heigt;

    public Person(Random random) {
        this.name = Name.values()[random.nextInt(Name.values().length)];
        this.secondName = SecondName.values()[random.nextInt(SecondName.values().length)];
        this.age = random.nextInt(40) + 20;
        this.weight = random.nextInt(60) + 60;
        this.heigt = random.nextInt(30) + 150;
    }

    @Override
    public String toString() {
        return name + " " + secondName + " ";
    }
}
