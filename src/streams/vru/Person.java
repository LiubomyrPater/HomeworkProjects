package streams.vru;

import streams.vru.enums.Name;
import streams.vru.enums.SecondName;

import java.util.Objects;
import java.util.Random;

public class Person {

    private Name name;
    private SecondName secondName;
    private int age;
    private int weight;
    private int heigt;



    protected Person(Random random) {
        this.name = Name.values()[random.nextInt(Name.values().length)];
        this.secondName = SecondName.values()[random.nextInt(SecondName.values().length)];
        this.age = random.nextInt(40) + 20;
        this.weight = random.nextInt(60) + 60;
        this.heigt = random.nextInt(30) + 150;
    }

    protected Person(Name name, SecondName secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name == person.name &&
                secondName == person.secondName;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, secondName);
    }

    @Override
    public String toString() {
        return name + " " + secondName + " ";
    }
}
