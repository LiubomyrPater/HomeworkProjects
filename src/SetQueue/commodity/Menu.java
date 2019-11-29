package SetQueue.commodity;

import service.Input;

public abstract class Menu {
    private static void printMenu(){
        System.out.print("\n" +
                                    "1 - Додати товар\n" +
                                    "2 - Видалити товар\n" +
                                    "3 - Замінити товар\n" +
                                    "4 - Сортувати за назвоню\n" +
                                    "5 - Сортувати за довжиною\n" +
                                    "6 - Сортувати за шириною\n" +
                                    "7 - Сортувати за вагою\n" +
                                    "8 - Виводимо і-тий елемент колекції\n" +
                                    "9 - Список всього товару\n" +
                                    "0 - Вийти з програми\n" +
                                    "\n" +
                                    "Ввід: ");
    }

    public static void mainMenu(){
        while (true){
            printMenu();
            String chapter = Input.getString();
            switch (chapter){
                case "1":{
                    Commodity.addCommodity();
                    break;
                }case "2":{
                    Commodity.removeCommodity();
                    break;
                }case "3":{
                    Commodity.changeCommodity();
                    break;
                }case "4":{
                    Commodity.sortByName();
                    break;
                }case "5":{
                    Commodity.sortByLength();
                    break;
                }case "6":{
                    Commodity.sortByWidth();
                    break;
                }case "7":{
                    Commodity.sortByWeight();
                    break;
                }case "8":{
                    Commodity.getAny();
                    break;
                }case "9":{
                    Commodity.getCommodityList();
                    break;
                }case "0":{
                    System.exit(0);
                }default:{
                    System.out.println("Неіснуючий пункт меню");
                }
            }
        }
    }
}
