package iterator;

import java.util.Random;

import static iterator.Menu.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        VR.getOne().createDeputies(random);
        boolean program = true;
        while (program){
            printMainMenu();
            program = choiceChapter();
        }
    }
}
