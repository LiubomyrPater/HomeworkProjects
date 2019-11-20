package enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int program = Realised.menu(input);
        System.out.print("Введіть, будь ласка, назву місяця: ");
        try{
            String month = input.next();
            Realised.programChapter(program, Realised.findMonth(month));
        }catch (MyEnumException m){
            System.out.println(m.getMessage());
        }
        main(args);
    }
}
