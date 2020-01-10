package cinema;

public enum UserInterface {

    CHOICE_LANGUAGE("\nChoice language please (0 - English, 1 - Українська)", "\nОберіть, будь ласка, мову (0 - English, 1 - Українська)"),
    GO_BACK("(back - \"<\")", "(повернутись назад - \"<\")"),
    EXIT_FROM_PROGRAM("(to exit the program enter \"<\"): ", "(для виходу з програми - введіть \"<\"): "),
    INPUT("Input, please: ", "Введіть, будь ласка: "),
    ACTION_EMPTY("Unfortunately, hasn't been implemented", "Нажаль, функцію не реалізовано!"),
    BAD("Something wrong, try again!", "Щось не так, спробуйте знову"),
    GOOD("", ""),
    ADD_SEANCE_SCHEDULE("1 - ","1 - додати сеанс в розклад"),
    REMOVE_SEANCE_SCHEDULE("2 - ","2 - видалити сеанс із розкладу"),
    ADD_MOVIE("3 - ","3 - додати фільм"),
    ADD_SEANCE_CINEMA("4 - ","4 - додати сеанс в кінотеатр"),
    REMOWE_MOVIE("5 - ","5 - видалити фільм"),
    REMOVE_SEANCE_CINEMA("6 - ","6 - видалити сеанс із інотеатру");


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
