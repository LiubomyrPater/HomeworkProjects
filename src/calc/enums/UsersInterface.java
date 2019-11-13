package calc.enums;

import calc.Main;

public enum UsersInterface {

    CHOICE_LANGUAGE("Choice language please (0 - English, 1 - Українська): ", "Оберіть, будь ласка, мову (0 - English, 1 - Українська)"),
    EXIT("(to exit the application enter <): ", "(для виходу з програми введеть <): "),
    EXIT_FROM_CALC("(to exit the calculator enter < ): ", "(для виходу з калькулятора введіть < ): "),
    CHOICE_DIGIT("Select the digit of the calculator: ", "Оберіть розрядність калькулятора: "),
    INPUT("input, please ", "Введіть числовий вираз "),
    ACTION_EMPTY("Unfortunately, hasn't been implemented", "Нажаль, функцію не реалізовано!"),
    ONLY_DIGIT("Only digit!!!", "Тільки цифри!!!"),
    ONLY_ACTION("Only +  -  /  *  !  %(remainder)  \u221A  S(sqrt)  ^(pow)", "Тільки +  -  /  *  !  %(остача)  \u221A  S(корінь)  ^(степінь)"),
    BAD("Something wrong, try again!", "Щось не так, спробуйте знову"),
    GOOD("", "");

    private String englishText;
    private String ukrainianText;

    UsersInterface(String englishText, String ukrainianText) {
        this.englishText = englishText;
        this.ukrainianText = ukrainianText;
    }

    public String getText() {
        if (Main.language){
            return englishText;
        }else {
            return ukrainianText;
        }
    }
}
