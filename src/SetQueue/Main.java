package SetQueue;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        new Commodity(20,new Random());

        Commodity commodity = new Commodity("jkjkljlkjlkjlkjl",987,80,890);

        System.out.println(Commodity.getCommodityList() + "\n" + Commodity.getCommodityList().size());

        Commodity.getCommodityList().add(commodity);

        System.out.println(Commodity.getCommodityList() + "\n" + Commodity.getCommodityList().size());

    }
}
