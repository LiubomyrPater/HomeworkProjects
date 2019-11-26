package iterator;

public class Deputy extends Person{


    private boolean khabar;
    private int valueKhabar;

    public Deputy(String name, String secondName, int age, int weight, int heigt, boolean khabar) {
        super(name, secondName, age, weight, heigt);
        this.khabar = khabar;
    }

    public void givKhabar(){
        //    Якщо поле хабарник false - то вивести на консоль :
// " Цей депутат не бере хабарів", якщо умова не виконується ,
// то ввести з консолі суму хабаря яку ви даєте,якщо це сума більша 5000, вивести на консоль "
// Миліція увязнить депутата", якщо не більша то занести в поле класу хабар дану суму.
    }



}
