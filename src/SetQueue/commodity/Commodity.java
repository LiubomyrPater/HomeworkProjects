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



    private final static Set<Commodity> commoditySet = new HashSet<>();

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
            commoditySet.add(new Commodity(random));
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

    public static Set<Commodity> getCommoditySet() {
        return commoditySet;
    }

    public static void addCommodity(Commodity commodity){
        commoditySet.add(commodity);
    }

    public static void removeCommodity(Commodity commodity){
        commoditySet.remove(commodity);
    }

    public static void changeCommodity(Commodity commodity){
        commoditySet.remove(commodity);
        commoditySet.add(new Commodity("iyriuew", 43232,3243,324));
    }

    public static void sortByName(){
        TreeSet<Commodity> sortedByName = new TreeSet<>(new CommodityComparators.NameComparator());
        sortedByName.addAll(commoditySet);
        System.out.println(sortedByName);
    }

    public static void sortByLength(){
        TreeSet<Commodity> sortedByLength = new TreeSet<>(new CommodityComparators.LendthComparator());
        sortedByLength.addAll(commoditySet);
        System.out.println(sortedByLength);
    }

    public static void sortByWidth(){
        TreeSet<Commodity> sortedByWidth = new TreeSet<>(new CommodityComparators.WidthComparator());
        sortedByWidth.addAll(commoditySet);
        System.out.println(sortedByWidth);
    }

    public static void sortByWeight(){
        TreeSet<Commodity> sortedByWeight = new TreeSet<>(new CommodityComparators.WeightComparator());
        sortedByWeight.addAll(commoditySet);
        System.out.println(sortedByWeight);
    }

    public static void getAny(){
        int number = Input.getInt();
        Commodity temp = null;
        Iterator<Commodity> commodityIterator = commoditySet.iterator();
        for (int i = 0; i <number ; i++) {
            temp = commodityIterator.next();
        }
        System.out.println(temp);
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
