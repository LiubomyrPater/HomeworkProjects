package streams.vr;

import java.util.ArrayList;
import java.util.List;

public class Fraction {

    private String name;

    private List<Deputy> deputies = new ArrayList<>();

    Fraction(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    void addDeputyInFraction(Deputy deputy){
        deputies.add(deputy);
    }

    void delDeputyFromFraction(Deputy deputy){
        deputies.remove(deputy);
    }

    void viewAllKhabar(){
        deputies.stream()
                .filter(Deputy::isKhabar)
                .forEach(System.out::println);
    }

    void theBigestKhabar(){
        deputies.stream()
                .max(new DeputyKhabarComparator())
                .ifPresent(System.out::println);
    }

    void viewDeputyFraction(){
        deputies.forEach(System.out::println);
    }

    void clearFraction(){
        this.deputies.clear();
    }


    @Override
    public String toString() {
        return "Fraction{" + name + ", deputies = " + deputies.size() + '}';
    }
}
