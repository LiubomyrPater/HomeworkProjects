package calc.extendsAction;

import calc.Action;
import static calc.enums.UsersInterface.*;

public final class Plug extends Action {

    @Override
    public double action() {
        System.out.println(ACTION_EMPTY.getText());
        return 0;
    }
}
