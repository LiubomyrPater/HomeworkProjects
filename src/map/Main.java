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
                    Zooclub.getOne(random).addMember(random);
                    break;
                }case "2":{
                    Zooclub.getOne(random).addAnimalInMember(random);
                    break;
                }case "3":{
                    Zooclub.getOne(random).remoweAnimalFromMember();
                    break;
                }case "4":{
                    Zooclub.getOne(random).remoweMember();
                    break;
                }case "5":{
                    Zooclub.getOne(random).remoweAnimalFromAllMembers();
                    break;
                }case "6":{
                    Zooclub.getOne(random).viewZooclub();
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
