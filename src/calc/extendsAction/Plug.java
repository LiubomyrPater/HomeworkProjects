package calc.extendsAction;

import calc.Action;
import calc.PrintFrases;

public final class Plug extends Action {
    public Plug() {
        PrintFrases.actionEmpty();
    }

    @Override
    public double action() {
        return 0;
    }
}
