package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fraction {

    private String name;

    private List<Deputy> deputies = new ArrayList<>();

    protected Fraction(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected void addDeputyInFraction(Deputy deputy){
        deputies.add(deputy);
    }

    protected void delDeputyFromFraction(Deputy deputy){
        deputies.remove(deputy);
    }

    protected void viewAllKhabar(){
        Iterator<Deputy> deputyIterator = deputies.iterator();
        while (deputyIterator.hasNext()){
            Deputy temp = deputyIterator.next();
            if (temp.isKhabar()){
                System.out.println(temp);
            }
        }
    }

    protected void theBigestKhabar(){
        deputies.sort(new DeputyKhabarComparator());
        System.out.println(deputies.get(0));
    }

    protected void viewDeputyFraction(){
        Iterator<Deputy> deputyIterator = deputies.iterator();
        while (deputyIterator.hasNext()){
            System.out.println(deputyIterator.next());
        }
    }

    protected void clearFraction(){
        this.deputies.clear();
    }


    @Override
    public String toString() {
        return "Fraction{" + name + ", deputies = " + deputies.size() + '}';
    }
}
