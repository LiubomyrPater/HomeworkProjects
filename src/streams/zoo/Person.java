package streams.zoo;

import java.util.Objects;
import java.util.Random;

public class Person {

    public enum Name{
        VASYL, OKSANA, OLEH
    }

    private Name name;
    private Integer age;

    public Person(Name name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(Random random) {
        this.name = Name.values()[random.nextInt(Name.values().length)];
        this.age = random.nextInt(100) + 18;
    }



    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "\n{" + name + ", " + age + '}';
    }
}
