package string;

import java.util.Scanner;

public class Main {

//  1 Створити програму, яка буде перевіряти, чи є слово з п'яти букв,
// введене користувачем, паліндромом (приклади: «пилип», «ротор»).
// Якщо введено слово не з 5 букв, то повідомляти про помилку.
// Програма повинна нормально обробляти слово, навіть якщо в ньому використані символи різного регістра.
// Наприклад, слова «Комок» або «РОТОР» слід також вважати паліндромами.

//  2 Замініть всі голосні букви в тексті на тире ('-').

//  3 Порахувати кількість слів у реченні. (Речення довільне)

//  4 Порахувати кількість речень в тексті. (Текст довільний)

//  5 Знайти слово яке найчастіше зустрічається в реченні.

//  6 Знайти слово яке найчастіше зустрічається в тексті.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word, please");

        String text = scanner.nextLine();



        //UserInterfaces.palindrom(text);


        //System.out.println(UserInterfaces.repalaceLoudLetters(text));


        //System.out.println(UserInterfaces.countWords(text));


        //System.out.println(UserInterfaces.countSentence(text));


        System.out.println(Realised.theMostRepetitiveLocalWord(text));












    }
}
