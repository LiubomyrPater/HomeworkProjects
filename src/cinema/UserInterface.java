package cinema;

public enum UserInterface {

    CHOICE_LANGUAGE("Choice language please (0 - English, 1 - Українська): ", "Оберіть, будь ласка, мову (0 - English, 1 - Українська)"),
    EXIT("(to exit the application enter <): ", "(для виходу з програми введеть <): "),
    EXIT_FROM_CALC("(to exit the calculator enter < ): ", "(для виходу з калькулятора введіть < ): "),
    INPUT("Input, please ", "Введіть, будь ласка "),
    ACTION_EMPTY("Unfortunately, hasn't been implemented", "Нажаль, функцію не реалізовано!"),
    BAD("Something wrong, try again!", "Щось не так, спробуйте знову"),
    GOOD("", "");

    private String englishText;
    private String ukrainianText;

    UserInterface(String englishText, String ukrainianText) {
        this.englishText = englishText;
        this.ukrainianText = ukrainianText;
    }

    public String getText(boolean language) {
        return language ? englishText : ukrainianText;
    }
}
