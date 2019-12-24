package lambda;

import lambda.theFifth.Amphibia;
import lambda.theFifth.Frog;
import lambda.theFirst.Cat;
import lambda.theFirst.Cow;
import lambda.theFirst.Dog;
import lambda.theFirst.Pet;
import lambda.theFourth.TheFourth;

import java.util.*;

public class main {
    public static void main(String[] args) {
/**
           Використовуючи функціональні інтерфейси та лямбда вирази -

        1. Написати абстрактний клас Pet, в якому описати абстрактний метод voice().
           Створити класи Cow, Cat, Dog, які наслідуються від Pet. Перевизначити в них метод voice(), так,
           щоб викликаючи його в методі main, на консоль виводилось: “Я кіт- Мяууу-Мяууу”, “Я пес-Гаууу-Гаууу”, “Я корова- Мууу-Мууу”.

        2. Напишіть програму, яка моделюватиме кидок монети?

        3. Виведіть найменше і найбільше число типу float і double в експоненціальній формі?

        4. Створіть клас із двома перевантаженими конструкторами.
           Використовуючи ключове слово this, викличте один конструктор в іншому?

        5. Створіть клас з іменем Amphibia, створіть клас Frog, який унаслідується від Amphibia.
           Створіть в класі Amphibia методи : (їсти, спати , плавати, гуляти), які виводитимуть будь-який текст на консоль.
           Створіть в мейн методі екземпляр класу Frog, приведіть його до типу Amphibia, і викличте до об’єкту Frog всі методи класу Amphibia.
*/

        //1.
        System.out.println("\n//1.");

        List<Pet> pets = Arrays.asList(new Cat(), new Cow(), new Dog());

        pets.forEach(x -> System.out.println(x.voice()));

        System.out.println("=======================\n");


        //2.                              ->   ?
        System.out.println("//2.");

        System.out.println(new Random().nextBoolean() ? "ОРЕЛ" : "РЕШКА");
        //() -> System.out.println(Random::nextBoolean ? "ОРЕЛ" : "РЕШКА");

        System.out.println("=======================\n");




        //3.                        ->   ?
        System.out.println("//3.");

        System.out.println("float min = " + Float.MIN_VALUE);
        System.out.println("float max = " + Float.MAX_VALUE);

        System.out.println("double min = " + Double.MIN_VALUE);
        System.out.println("double max = " + Double.MAX_VALUE);

        System.out.println("=======================\n");



        //4.                    ->   ?
        System.out.println("//4.");

        System.out.println(new TheFourth());

        System.out.println("=======================\n");




        //5.                            ->   ?
        System.out.println("//5.");

        Amphibia amphibia = (Amphibia)new Frog();

        amphibia.eat();
        amphibia.sleep();
        amphibia.swim();
        amphibia.walk();

        System.out.println("=======================\n");
    }
}
