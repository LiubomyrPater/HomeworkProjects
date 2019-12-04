package map;

//        Створити клас Зооклуб, як поля прописати в ньому Map.
//        Створити клас Person, який описати двома полями: імя, вік.
//        Створити клас Animal, який описати двома полями : тип тваринки(кіт,пес), імя тваринки.

import service.Input;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Random random = new Random();
        while (true){
            Menu.printMenu();
            String chapter = Input.getString();
            switch (chapter){
                case "1":{
                    Zooclub.getInstance(random).addMember(random);
                    break;
                }case "2":{
                    Zooclub.getInstance(random).addAnimalInMember(random);
                    break;
                }case "3":{
                    Zooclub.getInstance(random).remoweAnimalFromMember();
                    break;
                }case "4":{
                    Zooclub.getInstance(random).remoweMember();
                    break;
                }case "5":{
                    Zooclub.getInstance(random).remoweAnimalFromAllMembers();
                    break;
                }case "6":{
                    Zooclub.getInstance(random).viewZooclub();
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
