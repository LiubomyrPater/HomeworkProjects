package calc.enums;

import calc.Main;

public enum UsersInterface {

    CHOICE_LANGUAGE("Choice language please (0 - English, 1 - Українська): ", "Оберіть, будь ласка, мову (0 - English, 1 - Українська)"),
    CHOICE_DIGIT("Select the digit of the calculator: ", "Оберіть розрядність калькулятора"),
    INPUT("input, please: ", "Введіть числовий вираз: "),
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

    public String getText() {
        if (Main.language){
            return englishText;
        }else {
            return ukrainianText;
        }
    }

}
