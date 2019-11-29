package SetQueue.commodity;

import service.Input;

import java.util.*;

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



    private final static List<Commodity> commodityList = new ArrayList<>();

    private String name;
    private Integer length;
    private Integer width;
    private Integer weight;


    public Commodity(String name, int length, int width, int weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public Commodity(int count, Random random) {
        for (int i = 0; i <count ; i++) {
            commodityList.add(new Commodity(random));
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

    public String getName() {
        return name;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getWeight() {
        return weight;
    }

    public static List<Commodity> getCommodityList() {
        return commodityList;
    }

    public static void addCommodity(Commodity commodity){
        commodityList.add(commodity);
    }

    public static void removeCommodity(Commodity commodity){
        commodityList.remove(commodity);
    }

    public static void changeCommodity(Commodity commodity){
        commodityList.remove(commodity);
        commodityList.add(new Commodity("iyriuew", 43232,3243,324));
    }

    public static void sortByName(){
        commodityList.sort(new CommodityComparators.NameComparator());
        System.out.println(commodityList);
    }

    public static void sortByLength(){
        commodityList.sort(new CommodityComparators.LendthComparator());
        System.out.println(commodityList);
    }

    public static void sortByWidth(){
        commodityList.sort(new CommodityComparators.WidthComparator());
        System.out.println(commodityList);
    }

    public static void sortByWeight(){
        commodityList.sort(new CommodityComparators.WeightComparator());
        System.out.println(commodityList);
    }

    public static void getAny(){
        int any = Input.getInt();
        System.out.println(commodityList.get(any));
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
