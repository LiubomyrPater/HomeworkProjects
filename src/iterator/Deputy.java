package iterator;

import iterator.enums.Name;
import iterator.enums.SecondName;
import service.Input;

import java.util.Random;

public class Deputy extends Person{


    private boolean khabar;
    private int valueKhabar;

    protected Deputy(Random random) {
        super(random);
        if (random.nextBoolean())
            this.khabar = true;
    }

    protected Deputy(Name name, SecondName secondName) {
        super(name, secondName);
    }


    protected boolean isKhabar() {
        return khabar;
    }

    protected int getValueKhabar() {
        return valueKhabar;
    }

    protected void setValueKhabar(int valueKhabar) {
        this.valueKhabar += valueKhabar;
    }

    protected void givKhabar(){
        if (!khabar){
            System.out.println("Цей депутат не бере хабарів");
        }else {
            System.out.println("Яку суму ви пропонуєте");
            int value = Input.getInt();
            if (value > 5000){
                System.out.println("Міліція увязнить депутата");
            }else {
                setValueKhabar(value);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "(khabar " + khabar + ", " + "value khabar = " + valueKhabar + ")";
    }
}
