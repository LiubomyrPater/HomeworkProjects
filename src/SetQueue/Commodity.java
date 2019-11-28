package SetQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Commodity {
    //    2) Створити клас Commodity.
//    Описати даний клас: поля методи.
//    Повинні бути такі методи:
//    Додати товар
//    Видалити товар
//    Замінити товар
//    Сортувати за назвоню
//    Сортувати за довжиною
//    Сортувати за шириною
//    Сортувати за вагою
//    Виводимо і-тий елемент колекції(який ми вводимо з консолі(використовуємо Scanner))
//    Вийти з програми(підказка System.exit)
//
//    Для меню використати Switch.
//    Продемонструвати як виконується кожен метод над списком і
//    виводити список після змін в ньому.

    private List<Commodity> commodityList = new ArrayList<>();

    private String name;
    private int length;
    private int width;
    private int weight;

    public Commodity(String name, int length, int width, int weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
        commodityList.add(this);
    }

    public Commodity(int count, Random random) {
        for (int i = 0; i <count ; i++) {
            Commodity commodity = new Commodity(random);
            this.commodityList.add(commodity);
        }
    }

    private Commodity(Random random) {
        char[] chars = new char[4];
        for (int i = 0; i < 4; i++) {
            chars[i] = (char)(random.nextInt(25) + 65);
        }
        this.name = String.valueOf(chars);
        this.length = random.nextInt(40) + 10;
        this.width = random.nextInt(40) + 10;
        this.weight = random.nextInt(40) + 10;
    }

    public List<Commodity> getCommodityList() {
        return commodityList;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}' + "\n";
    }
}
