package iterator;

import service.Input;

import java.util.Random;

public class Deputy extends Person{


    private boolean khabar;
    private int valueKhabar;

    public Deputy(Random random) {
        super(random);
        if (random.nextInt(2) == 1){
            this.khabar = true;
        }else {
            this.khabar = false;
        }
    }

    public void setValueKhabar(int valueKhabar) {
        this.valueKhabar += valueKhabar;
    }

    public void givKhabar(){
//      Якщо поле хабарник false - то вивести на консоль :
//      "Цей депутат не бере хабарів", якщо умова не виконується ,
//      то ввести з консолі суму хабаря яку ви даєте,якщо це сума більша 5000, вивести на консоль
//      "Міліція увязнить депутата", якщо не більша то занести в поле класу хабар дану суму.

        if (!khabar){
            System.out.println("Цей депутат не бере хабарів");
        }else {
            System.out.println("Яку суму ви пропонуєте");
            int value = Input.getScannerCheckedValue(Input.VariableTypes.INTEGER);
            if (value > 5000){
                System.out.println("Міліція увязнить депутата");
            }else {
                setValueKhabar(value);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "(khabar " + khabar + ", " + "value khabar = " + valueKhabar + ")";
    }
}
