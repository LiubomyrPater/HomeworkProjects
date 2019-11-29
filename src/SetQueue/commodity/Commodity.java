package SetQueue.commodity;

import service.Input;

import java.util.*;

public class Commodity {

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

    public static void getCommodityList() {
        System.out.println(commodityList);;
    }

    public static Commodity createCommodity(){
        System.out.print("Введіть назву товару: ");
        String name = Input.getString();
        System.out.print("Введіть довжину товару: ");
        Integer lenght = Input.getInt();
        System.out.print("Введіть ширину товару: ");
        Integer width = Input.getInt();
        System.out.print("Введіть массу товару: ");
        Integer weight = Input.getInt();
        Commodity temp = new Commodity(name, lenght, width, weight);
        return temp;
    }

    public static void addCommodity(){
        Commodity temp = createCommodity();
        commodityList.add(temp);
    }

    public static void removeCommodity(){
        Commodity temp = createCommodity();
        commodityList.remove(temp);
    }

    public static void changeCommodity(){
        Commodity temp = createCommodity();
        commodityList.remove(temp);
        System.out.println("\n");
        commodityList.add(createCommodity());
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return Objects.equals(name, commodity.name) &&
                Objects.equals(length, commodity.length) &&
                Objects.equals(width, commodity.width) &&
                Objects.equals(weight, commodity.weight);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, length, width, weight);
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
