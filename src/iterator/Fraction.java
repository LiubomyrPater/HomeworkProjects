package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fraction {

    private String name;
    private List<Deputy> deputies = new ArrayList<>();

    public Fraction(String name) {
        this.name = name;
    }



    //    додати депутата(вводимо з консолі)
    public void addDeputyInFraction(Deputy deputy){}

    //    видалити депутата(вводимо з консолі)
    public void delDeputyFromFraction(Deputy deputy){}

    //    вивести всіх хабарників у фракції
    public void viewAllKhabar(){}

    //    вивести найбільшого хабарника у фракції
    public Deputy theBigestKhabar(){
        Random random =new Random();
        return new Deputy(random);
    }

    //    вивести всіх депутатів фракції
    public void viewDeputyFraction(){}

    //    очистити всю фракцію від депутатів
    public void clearFraction(){}


}
