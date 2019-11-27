package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VR {

    private static VR one;
    private List<Fraction> fractions = new ArrayList<>();
    private List<Deputy> deputies = new ArrayList<>();

    private VR(){}

    public static VR getOne(){
        if (one == null){
            one = new VR();
        }
        return one;
    }

    public void viewDeputies() {
        for (Deputy x : deputies) {
            System.out.println(x);
        }
    }

    public void createDeputy(Random random){
        for (int i = 0; i <450 ; i++) {
            deputies.add(new Deputy(random));
        }
    }

    public void addFraction(){}

    public void delFraction(Fraction fraction){}

    public void viewAllFractions(){}

    public Fraction choiceFraction(){
        return new Fraction("saddsa");
    }



}
