package iterator;

import java.util.ArrayList;
import java.util.List;

public class VR {

    private static VR one;
    private static int count = 0;
    private List<Fraction> fractions = new ArrayList<>();

    private VR(){}

    public static VR getOne(){
        if (one == null){
            one = new VR();
        }
        return one;
    }




    private static void newFraction(){}

    private static void delFraction(Fraction fraction){}

    private static void viewAllFractions(){}



}
