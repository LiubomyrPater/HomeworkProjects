package streams.zoo;
/**
 Використовуючи лямбди та StreamAPI створити клас Зооклуб, як поля прописати в ньому Map.


 Створити клас Person, який описати двома полями: імя, вік.

 Створити клас Animal, який описати двома полями: тип тваринки(кіт,пес), імя тваринки.
 В класі Зооклуб як поле прописати наступне:
 Map<Person, List<Pet>> map;
 Реалізувати консольне меню, таким чином щоб можна було:
 Додати учасника клубу
 Додати тваринку до учасника клубу
 Видалити тваринку з учасника клубу
 Видалити учасника з клубу
 Видалити конкретну тваринку зі всіх власників
 Вивести на екран зооклуб
 Вийти з програми

 Використати для побудови меню Switch.
 */
import service.Input;

public class Main {


    public static void main(String[] args) {

        Zooclub.randomCreateMembers(5, 15);

        while (true){
            System.out.print(UserInterfaces.PRINT_MENU.getText());
            String chapter = Input.getString();
            switch (chapter){
                case "1":{
                    Zooclub.addMember();
                    break;
                }case "2":{
                    Zooclub.addAnimalToMember();
                    break;
                }case "3":{
                    Zooclub.remoweAnimalFromMember();
                    break;
                }case "4":{
                    Zooclub.remoweMember();
                    break;
                }case "5":{
                    Zooclub.remoweAnimalFromAllMembers();
                    break;
                }case "6":{
                    Zooclub.viewZooclub();
                    break;
                }case "0":{
                    System.exit(0);
                }default:{
                    System.out.println(UserInterfaces.NOT_IMPLEMENTED.getText());
                }
            }
        }
    }
}
