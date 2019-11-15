package calc.extendsAction;

import calc.Action;
import calc.PrintFrases;

public final class Plug extends Action {
    public Plug(boolean language) {
        PrintFrases.actionEmpty(language);
    }

    @Override
    public double action() {
        return 0;
    }
}
