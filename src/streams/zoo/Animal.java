package streams.zoo;

import java.util.Objects;
import java.util.Random;

public class Animal {

    private Type type;
    private String name;

    public enum Type{
        DOG, CAT, HORSE, RABIT, MOUSE
    }

    public Animal(Random random) {
        this.type = Type.values()[random.nextInt(Type.values().length)];

        char[] chars = new char[5];
        for (int i = 0; i <5; i++) {
            chars[i] = (char)(random.nextInt(25) + 97);
        }
        chars[0] = (char) (Integer.valueOf(chars[0]) - 32);
        this.name = String.valueOf(chars);
    }

    public Animal() {
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return type == animal.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return type + " \"" + name + "\"";
    }
}
