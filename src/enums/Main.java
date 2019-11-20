package enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int program = Realised.menu();
        System.out.print("Введіть, будь ласка, назву місяця: ");
        try{
            Realised.programChapter(program, Realised.findMonth(input.next()));
        }catch (MyEnumException m){
            System.out.println(m.getMessage());
        }
        main(args);
    }
}
