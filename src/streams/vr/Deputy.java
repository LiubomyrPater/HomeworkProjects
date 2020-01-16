package streams.vr;

import service.Input;
import streams.vr.enums.Name;
import streams.vr.enums.SecondName;
import streams.vr.enums.UserInterface;

import java.util.Random;

public class Deputy extends Person {


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


    boolean isKhabar() {
        return khabar;
    }

    int getValueKhabar() {
        return valueKhabar;
    }

    private void setValueKhabar(int valueKhabar) {
        this.valueKhabar += valueKhabar;
    }

    void givKhabar(){
        if (!khabar)
            System.out.println(UserInterface.DEPUTY_DOESNT_TAKE_BRIBES.getText());
        else {
            System.out.println(UserInterface.HOW_SUM.getText());
            int value = Input.getInt();
            if (value > 5000)
                System.out.println(UserInterface.POLICE.getText());
            else
                setValueKhabar(value);
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
