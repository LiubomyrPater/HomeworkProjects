package SetQueue;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Commodity commodity = new Commodity(20, random);

        System.out.println(commodity.getCommodityList());


    }
}
