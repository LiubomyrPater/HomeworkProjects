package streams;

import service.Input;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.print("\"vru\" or \"zoo\" (for exit input \"<\") select, please: ");
            String choice = Input.getString();
            if (choice.equalsIgnoreCase("vru"))
                streams.vru.Main.main(args);
            else if (choice.equalsIgnoreCase("zoo"))
                streams.zoo.Main.main(args);
            else if (choice.equals("<"))
                System.exit(0);
            else
                System.out.println("Something wrong...");
        }
    }
}
