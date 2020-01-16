package streams.vr;

import streams.vr.enums.Name;
import streams.vr.enums.SecondName;

import java.util.Objects;
import java.util.Random;

public class Person {

    private Name name;
    private SecondName secondName;


    protected Person(Random random) {
        this.name = Name.values()[random.nextInt(Name.values().length)];
        this.secondName = SecondName.values()[random.nextInt(SecondName.values().length)];
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
