package calc;

public enum Action {

    ADD("addition", "додавання", '+'),
    MUL("multiplication", "множення", '*'),
    DIV("division", "ділення", '/'),
    SUB("subtraction", "віднімання", '-'),
    MOD("remainder", "остача", '%'),
    SQRT("square root", "квадратний корінь", '\u221A'),
    FACT("factorial", "факторіал", '!');

    Action(String englishName, String ukrainianName, Character symbolAction) {
    }
}
