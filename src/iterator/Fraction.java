package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fraction {

    private String name;

    private List<Deputy> deputies = new ArrayList<>();

    public Fraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDeputyInFraction(Deputy deputy){
        deputies.add(deputy);
    }

    public void delDeputyFromFraction(Deputy deputy){
        deputies.remove(deputy);
    }

    public void viewAllKhabar(){
        Iterator<Deputy> deputyIterator = deputies.iterator();
        while (deputyIterator.hasNext()){
            Deputy temp = deputyIterator.next();
            if (temp.isKhabar()){
                System.out.println(temp);
            }
        }
    }

    public void theBigestKhabar(){
        deputies.sort(new DeputyKhabarComparator());
        System.out.println(deputies.get(0));
    }

    public void viewDeputyFraction(){
        Iterator<Deputy> deputyIterator = deputies.iterator();
        while (deputyIterator.hasNext()){
            System.out.println(deputyIterator.next());
        }
    }

    public void clearFraction(){
        this.deputies.clear();
    }


    @Override
    public String toString() {
        return "Fraction{" + name + ", deputies = " + deputies.size() + '}';
    }
}
