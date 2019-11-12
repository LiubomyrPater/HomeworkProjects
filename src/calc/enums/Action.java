package calc.enums;

public enum Action {

    ADD("addition", "додавання", '+'),
    MUL("multiplication", "множення", '*'),
    DIV("division", "ділення", '/'),
    SUB("subtraction", "віднімання", '-'),
    MOD("remainder", "остача", '%'),
    SQRT("square root", "квадратний корінь", '\u221A'),
    FACT("factorial", "факторіал", '!');

    private String englishName;
    private String ukrainianName;
    private Character symbolActon;

    Action(String englishName, String ukrainianName, Character symbolActon) {
        this.englishName = englishName;
        this.ukrainianName = ukrainianName;
        this.symbolActon = symbolActon;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getUkrainianName() {
        return ukrainianName;
    }

    public Character getSymbolActon() {
        return symbolActon;
    }
}
