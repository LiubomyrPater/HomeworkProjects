package iterator;

import java.util.Objects;

public class Person {

    private String name;
    private String secondName;
    private int age;
    private int weight;
    private int heigt;

    public Person(String name, String secondName, int age, int weight, int heigt) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.weight = weight;
        this.heigt = heigt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeigt() {
        return heigt;
    }

    public void setHeigt(int heigt) {
        this.heigt = heigt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(secondName, person.secondName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, secondName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
