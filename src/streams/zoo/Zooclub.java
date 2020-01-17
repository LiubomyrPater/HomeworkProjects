package streams.zoo;

import service.Input;
import java.util.*;
/**
        В класі Зооклуб як поле прописати наступне: Map<Person, List<Pet>> map;

        Реалізувати консольне меню, таким чином щоб можна було:

        Додати учасника клубу
        Додати тваринку до учасника клубу
        Видалити тваринку з учасника клубу
        Видалити учасника з клубу
        Видалити конкретну тваринку зі всіх власників
        Вивести на екран зооклуб
*/
abstract class Zooclub {

    private final static Random random = new Random();
    private final static Map<Person, List<Animal>> personListMap = new HashMap<>();


    static void randomCreateMembers(int from, int to){
        for (int j = 0; j < (random.nextInt(to - from) + from); j++) {
            List<Animal> animals = new ArrayList<>();
            for (int i = 0; i < (random.nextInt(5) + 1); i++) {
                animals.add(new Animal(random));
            }
            personListMap.put(new Person(random), animals);
        }
    }

    static void addMember(){
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < (random.nextInt(5) + 1); i++) {
            animals.add(new Animal(random));
        }
        personListMap.put(new Person(random), animals);
    }

    static void addAnimalToMember(){
        Person person = choiceMember();
        if (person != null) {
            System.out.println(Arrays.toString(personListMap.get(person).toArray()));
            personListMap.get(person).add(new Animal(random));
            System.out.println(Arrays.toString(personListMap.get(person).toArray()));
        }
    }

    static void remoweAnimalFromMember(){
        Person person = choiceMember();
        if (person != null){
            System.out.println(Arrays.toString(personListMap.get(person).toArray()));
            System.out.print(UserInterfaces.SELECT_ANIMAL.getText());

            String temp = Input.getString();
            Animal.Type animalType = choiceAnimalType(temp);
            if (animalType != null){
                Animal animal = new Animal(animalType);
                personListMap.get(person).remove(animal);
            }
        }
    }

    static void remoweMember(){
        Person person = choiceMember();
        personListMap.remove(person);
    }

    static void remoweAnimalFromAllMembers(){
        System.out.println(UserInterfaces.INPUT_ANIMALS_TYPE.getText());
        String temp = Input.getString();
        Animal.Type animalType = choiceAnimalType(temp);
        if (animalType != null){
            Animal animal = new Animal(animalType);
            Set<Map.Entry<Person, List<Animal>>> entrySet = personListMap.entrySet();
            entrySet.forEach(pair -> pair.getValue().remove(animal));
        }
    }

    static void viewZooclub(){
        System.out.println(personListMap);
    }

    private static Animal.Type choiceAnimalType(String type){
        try {
            return Animal.Type.valueOf(type);
        }catch (IllegalArgumentException a){
            System.out.println(UserInterfaces.TYPE_NOT_EXIST.getText());
            return null;
        }
    }

    private static Person choiceMember(){
        System.out.print(UserInterfaces.INPUT_NAME_AND_AGE.getText());
        String wholeName = Input.getString();
        String[] names = wholeName.split("\\s+");

        try {
            Person.Name name = Person.Name.valueOf(names[0].trim().toUpperCase());
            Integer age = Integer.valueOf(names[1].trim());
            Person temp = new Person(name, age);
            boolean findMember = false;
            Set<Map.Entry<Person, List<Animal>>> entrySet = personListMap.entrySet();
            for (Map.Entry<Person, List<Animal>> pair : entrySet){
                if (pair.getKey().equals(temp)){
                    temp = pair.getKey();
                    findMember = true;
                }
            }

            if (findMember){
                return temp;
            }else {
                System.out.println(UserInterfaces.WASNT_FIND_MEMEBER.getText());
                return null;
            }

        }catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e){
            System.out.println(UserInterfaces.WASNT_FIND_MEMEBER.getText());
            return null;
        }
    }
}
