package SetQueue.commodity;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Commodity> commodityList = Commodity.commodities(10,new Random());

        Menu.mainMenu(commodityList);


    }
}
