package iterator;

import java.util.Random;

import static iterator.Realised.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        VR.getOne().createDeputy(random);
        boolean program = true;
        while (program){
            printMainMenu();
            program = choiceChapter();
        }
    }
}
