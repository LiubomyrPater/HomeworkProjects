package map;


import service.Input;

import java.util.*;

//        В класі Зооклуб як поле прописати наступне: Map<Person, List<Pet>> map;

//        Реалізувати консольне меню, таким чином щоб можна було:

//        Додати учасника клубу
//        Додати тваринку до учасника клубу
//        Видалити тваринку з учасника клубу
//        Видалити учасника з клубу
//        Видалити конкретну тваринку зі всіх власників
//        Вивести на екран зооклуб


public final class Zooclub {

    private static Zooclub instance = new Zooclub(new Random());

    private final Map<Person, List<Animal>> personListMap = new HashMap<>();

    private Zooclub(Random random) {
        for (int j = 0; j < (random.nextInt(10) + 10); j++) {
            List<Animal> animals = new ArrayList<>();
            for (int i = 0; i < (random.nextInt(5) + 1); i++) {
                animals.add(new Animal(random));
            }
            personListMap.put(new Person(random), animals);
        }
    }

    public static Zooclub getInstance(Random random){
        return instance;
    }

    public void addMember(Random random){
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < (random.nextInt(5) + 1); i++) {
            animals.add(new Animal(random));
        }
        personListMap.put(new Person(random), animals);
    }

    public void addAnimalInMember(Random random){
        Person person = choiceMember();
        if (person != null) {
            System.out.println(Arrays.toString(personListMap.get(person).toArray()));
            personListMap.get(person).add(new Animal(random));
            System.out.println(Arrays.toString(personListMap.get(person).toArray()));
        }
    }

    public void remoweAnimalFromMember(){
        Person person = choiceMember();
        if (person != null){
            System.out.println(Arrays.toString(personListMap.get(person).toArray()));
            System.out.print("Оберіть тваринку: ");
        }
        //personListMap.get(person).remove(5);
    }

    public void remoweMember(){
        Person person = new Person(Person.Name.OLEH, 980);
        personListMap.remove(person);
    }

    public void remoweAnimalFromAllMembers(){
        Animal animal = new Animal();
        animal.setType(Animal.Type.CAT);
        Set<Map.Entry<Person, List<Animal>>> entrySet = personListMap.entrySet();
        for (Map.Entry<Person, List<Animal>> pair: entrySet){
            pair.getValue().remove(animal);
        }
    }

    public void viewZooclub(){
        System.out.println(personListMap);
    }
    
    private Person choiceMember(){
        System.out.print("Введіть ім'я та вік члена зооклубу: ");
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
                System.out.println("Такого члена зооклубу не знайдено");
                return null;
            }

        }catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e){
            System.out.println("Такого члена зооклубу не знайдено");
            return null;
        }
    }
}
