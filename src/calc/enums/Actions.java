package calc.enums;

import calc.Main;

public enum Actions {

    ADD("addition", "додавання", '+'),
    SUB("subtraction", "віднімання", '-'),
    MUL("multiplication", "множення", '*'),
    DIV("division", "ділення", '/'),
    MOD("remainder", "остача", '%'),
    SQRT("square root", "квадратний корінь", '\u221A'),
    FACT("factorial", "факторіал", '!');

    private String englishName;
    private String ukrainianName;
    private Character symbolAction;

    Actions(String englishName, String ukrainianName, Character symbolAction) {
        this.englishName = englishName;
        this.ukrainianName = ukrainianName;
        this.symbolAction = symbolAction;
    }

    public String getEnglishName() {
        if (Main.language){
            return englishName;
        }else {
            return ukrainianName;
        }
    }

    public Character getSymbolAction() {
        return symbolAction;
    }


}
