package cinema;

public enum UserInterface {

    CHOICE_LANGUAGE("\nChoice language please (0 - English, 1 - Українська)", "\nОберіть, будь ласка, мову (0 - English, 1 - Українська)"),
    GO_BACK("(back - \"<\")", "(повернутись назад - \"<\")"),
    EXIT_FROM_PROGRAM("(to exit the program enter \"<\"): ", "(для виходу з програми - введіть \"<\"): "),
    INPUT("Input, please: ", "Введіть, будь ласка: "),
    ACTION_EMPTY("Unfortunately, hasn't been implemented", "Нажаль, функцію не реалізовано!"),
    BAD("Something wrong, try again!", "Щось не так, спробуйте знову"),
    BAD_TIME("Not addeded: ", "Не додано: "),
    ADD_SEANCE_SCHEDULE("1 - ","1 - додати сеанс в розклад"),
    REMOVE_SEANCE_SCHEDULE("2 - ","2 - видалити сеанс із розкладу"),
    ADD_MOVIE("3 - ","3 - додати фільм"),
    ADD_SEANCE_CINEMA("4 - ","4 - додати сеанс в кінотеатр"),
    REMOWE_MOVIE("5 - ","5 - видалити фільм"),
    REMOVE_SEANCE_CINEMA("6 - ","6 - видалити сеанс із кінотеатру"),
    INPUT_MOVIE_NAME("","Введіть назву фільму: "),
    INPUT_MOVIE_DURATION("","Введіть тривалість фільму у хвилинах: "),
    DURATION_IS_EMPTY("","Тривальсть фільму повинна бути числом більшим за нуль!!!"),
    INPUT_SEANCE_TIME("","Введіть час сеансів у форматі ГГ:ХХ (10:40, 12:00): "),
    NAME_IS_EMPTY("","Назва фільму повинна містити хоча б один символ!!!"),
    MOVIE_NOT_FOUND("","Фільм не знайдено!!!"),
    MOVIE_DELETED("","Фільм видалено"),
    TIME_IS_EMPTY("","Невірно введений час!!!");


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
