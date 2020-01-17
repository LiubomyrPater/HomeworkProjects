package streams.zoo;

public enum UserInterfaces {

    NOT_IMPLEMENTED("Неіснуючий пункт меню"),
    SELECT_ANIMAL("Оберіть тваринку: "),
    INPUT_ANIMALS_TYPE("Оберіть вид тваринки"),
    INPUT_NAME_AND_AGE("Введіть ім'я та вік члена зооклубу: "),
    WASNT_FIND_MEMEBER("Такого члена зооклубу не знайдено"),
    TYPE_NOT_EXIST("Такої тваринки не існує"),
    PRINT_MENU("\n" +
            "1 - Додати учасника клубу\n" +
            "2 - Додати тваринку до учасника клубу\n" +
            "3 - Видалити тваринку з учасника клубу\n" +
            "4 - Видалити учасника з клубу\n" +
            "5 - Видалити конкретну тваринку зі всіх власників\n" +
            "6 - Вивести на екран зооклуб\n" +
            "0 - Вийти з програми\n" +
            "\n" +
            "Ввід: ");
    private String text;

    UserInterfaces(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
