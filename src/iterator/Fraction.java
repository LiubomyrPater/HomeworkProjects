package iterator;

import java.util.ArrayList;
import java.util.List;

public class Fraction {

    private String name;
    private int count = 0;
    private List<Deputy> deputies = new ArrayList<>();

    public Fraction(String name) {
        this.name = name;
    }



    //    додати депутата(вводимо з консолі)
    private static void addDeputyInFraction(Fraction fraction, Deputy deputy){}

    //    видалити депутата(вводимо з консолі)
    private static void delDeputyFromFraction(Fraction fraction, Deputy deputy){}

    //    вивести всіх хабарників у фракції
    private static void viewAllKhabar(){}

    //    вивести найбільшого хабарника у фракції
    private static void theBigestKhabar(){}

    //    вивести всіх депутатів фракції
    private static void viewDeputyFraction(Fraction fraction){}

    //    очистити всю фракцію від депутатів
    private static void clearFraction(Fraction fraction){}


}
