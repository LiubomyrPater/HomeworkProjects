package iterator;

import iterator.enums.Name;
import iterator.enums.SecondName;
import service.Input;

import java.util.ArrayList;
import java.util.Iterator;
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

    public void createDeputies(Random random){
        for (int i = 0; i <450 ; i++) {
            deputies.add(new Deputy(random));
        }
    }

    public void addFraction(){
        System.out.print("Введіть назву нової фракці: ");
        String name = Input.getScannerCheckedValue(Input.VariableTypes.STRING);
        one.fractions.add(new Fraction(name));
    }

    public void delFraction(Fraction fraction){
        if (fraction != null){
            fractions.remove(fraction);
        }
    }

    public void viewAllFractions(){
        Iterator<Fraction> fractionIterator = fractions.iterator();
        while (fractionIterator.hasNext()){
            System.out.println(fractionIterator.next());
        }
    }

    public Fraction choiceFraction(){
        System.out.print("Введіть назву фракці: ");
        String name = Input.getScannerCheckedValue(Input.VariableTypes.STRING);
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
        if (findFraction){
            return fractions.get(numberFraction);
        }else {
            return null;
        }
    }

    public Deputy choiceDeputy(){
        System.out.print("Введіть ім'я та прізвище депутата: ");
        String wholeName = Input.getScannerCheckedValue(Input.VariableTypes.STRING);
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
            if (findDeputy){
                return deputies.get(numberDeputy);
            }else {
                System.out.println("Депутата не знайдено");
                return null;
            }

        }catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e){
            return null;
        }
    }
}
