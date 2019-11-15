package calc;
public class Main {

    public static void main(String[] args) {
        boolean language = true;
        while (true){
            language = ProgramLogic.choiceLanguage(language);
        }
    }
}
