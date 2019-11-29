package SetQueue.commodity;

import service.Input;

public abstract class Menu {
    public static void printMenu(){
        System.out.print("\n" +
                                    "1 - Додати товар\n" +
                                    "2 - Видалити товар\n" +
                                    "3 - Замінити товар\n" +
                                    "4 - Сортувати за назвоню\n" +
                                    "5 - Сортувати за довжиною\n" +
                                    "6 - Сортувати за шириною\n" +
                                    "7 - Сортувати за вагою\n" +
                                    "8 - Виводимо і-тий елемент колекції\n" +
                                    //"9 - \n" +
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
                    break;
                }case "2":{
                    break;
                }case "3":{
                    break;
                }case "4":{
                    break;
                }case "5":{
                    break;
                }case "6":{
                    break;
                }case "7":{
                    break;
                }case "8":{
                    break;
                }case "9":{
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
