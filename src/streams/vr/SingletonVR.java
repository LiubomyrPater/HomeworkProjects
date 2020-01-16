package streams.vr;

import service.Input;
import streams.vr.enums.Name;
import streams.vr.enums.SecondName;
import streams.vr.enums.UserInterface;

import java.util.*;
import java.util.function.Predicate;

public class SingletonVR {

    private List<Fraction> fractions = new ArrayList<>();
    private List<Deputy> deputies = new ArrayList<>();

    private SingletonVR(){}

    private static class SingletonHolder{
        private static final SingletonVR HOLDER_INSTANCE = new SingletonVR();
    }

    public static SingletonVR getInstance(){
        return SingletonHolder.HOLDER_INSTANCE;
    }



    void viewDeputies() {
        deputies.forEach(System.out::println);
    }

    void createDeputies(Random random){
        for (int i = 0; i <50 ; i++)
            deputies.add(new Deputy(random));
    }

    void addFraction(){
        System.out.print(UserInterface.INPUT_NAME_NEW_FRACTION.getText());
        String name = Input.getString();
        getInstance().fractions.add(new Fraction(name));
    }

    void delFraction(Fraction fraction){
        Predicate<Fraction> a = Objects::nonNull;
        if (a.test(fraction))
            fractions.remove(fraction);
    }

    void viewAllFractions(){
        fractions.forEach(System.out::println);
    }

    Fraction choiceFraction(){
        System.out.print(UserInterface.INPUT_NAME_FRACTION.getText());
        String name = Input.getString();
        Iterator<Fraction> fractionIterator = fractions.iterator();
        int numberFraction = -1;
        boolean findFraction = false;
        while (fractionIterator.hasNext()){
            numberFraction += 1;
            if (fractionIterator.next().getName().equalsIgnoreCase(name)){
                findFraction = true;
                break;
            }
        }
        if (findFraction)
            return fractions.get(numberFraction);
        else {
            System.out.println(UserInterface.FRACTION_WASNT_FOUND.getText());
            return null;
        }
    }

    Deputy choiceDeputy(){
        System.out.print(UserInterface.INPUT_NAME_DEPUTY.getText());
        String wholeName = Input.getString();
        String[] names = wholeName.split("\\s+");

        try {
            Name name = Name.valueOf(names[0].trim().toUpperCase());
            SecondName secondName = SecondName.valueOf(names[1].trim().toUpperCase());

            Deputy temp = new Deputy(name, secondName);
            Iterator<Deputy> deputyIterator = deputies.iterator();
            int numberDeputy = -1;
            boolean findDeputy = false;
            while (deputyIterator.hasNext()){
                numberDeputy += 1;
                if (deputyIterator.next().equals(temp)){
                    findDeputy = true;
                    break;
                }
            }
            if (findDeputy)
                return deputies.get(numberDeputy);
            else {
                System.out.println(UserInterface.DEPUTY_WASNT_FOUND.getText());
                return null;
            }

        }catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e){
            System.out.println(UserInterface.DEPUTY_WASNT_FOUND.getText());
            return null;
        }
    }
}
