package lambda.theFourth;
/**
     4. Створіть клас із двома перевантаженими конструкторами.
        Використовуючи ключове слово this, викличте один конструктор в іншому?
 */
public class TheFourth {

    private String name;
    private Integer count;

    public TheFourth(String name, Integer count) {
        this.name = name;
        this.count = count;
    }


    public TheFourth() {
        this("Override", 777);
    }

    @Override
    public String toString() {
        return "TheFourth{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
