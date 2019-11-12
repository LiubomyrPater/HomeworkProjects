package calc.enums;

public enum UsersInterface {

    CHOICE_LANGUAGE("Choice language please (1 - English, 2 - Українська): ", "Оберіть, будь ласка, мову (1 - English, 2 - Українська)"),
    CHOICE_DIGIT("Select the digit of the calculator: ", "Оберіть розрядність калькулятора"),
    ONLY_DIGIT("Only digit!!!", "Тільки цифри!!!"),
    ONLY_ACTION("Only +  -  /  *  !  %  \u221A", "Тільки +  -  /  *  !  %  \u221A"),
    BAD("Something wrong, try again!", "Щось не так, спробуйте знову"),
    GOOD("", "");

    private String englishText;
    private String ukrainianText;

    UsersInterface(String englishText, String ukrainianText) {
        this.englishText = englishText;
        this.ukrainianText = ukrainianText;
    }

    public String getEnglishText() {
        return englishText;
    }

    public String getUkrainianText() {
        return ukrainianText;
    }
}
