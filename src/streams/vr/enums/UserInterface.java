package streams.vr.enums;

public enum UserInterface {

    DEPUTY_DOESNT_TAKE_BRIBES("Цей депутат не бере хабарів"),
    HOW_SUM("Яку суму ви пропонуєте"),
    POLICE("Поліція увязнить депутата"),
    TRY_AGAIN("Спробуйте знову"),
    INPUT_NAME_NEW_FRACTION("Введіть назву нової фракці: "),
    INPUT_NAME_FRACTION("Введіть назву фракці: "),
    FRACTION_WASNT_FOUND("Фракцію не знайдено"),
    INPUT_NAME_DEPUTY("Введіть ім'я та прізвище депутата: "),
    DEPUTY_WASNT_FOUND("Депутата не знайдено"),
    PRINT_MENU("\n" +
            "Введіть 1 щоб додати фракцію\n" +
            "Введіть 2 щоб видалити конкретну фракцію\n" +
            "Введіть 3 щоб вивести усі фракції\n" +
            "Введіть 4 щоб очистити конкретну фракцію\n" +
            "Введіть 5 щоб вивести депутатів фракції\n" +
            "Введіть 6 щоб додати депутата в фракцію\n" +
            "Введіть 7 щоб видалити депутата з фракції\n" +
            "Введіть 8 щоб вивести список хабарників у фракції\n" +
            "Введіть 9 щоб вивести найбільшого хабарника у фракції\n" +
            "Введіть 0 щоб запропонувати депутату хабар\n" +
            "Введіть + щоб вивести всіх депутатів Верховної ради\n" +
            "Введіть < щоб вийти із програми\n" +
            ": ");

    private String text;

    UserInterface(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
