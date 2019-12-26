package InnerClass.test_2;

import InnerClass.test.Test;

public class Tested {

    public static void some() {

        new Test();         // Основний клас
        new Test.Test6();   // Публічний статичний в межах основного

        /**
         new Test2();        // Сформований за дужкою
         new Test.Test2();   // Публічний нестатичний в межах основного класу з однаковою назвою класа за дужкою
         new Test.Test3();   // Публічний нестатичний в межах основного класу
         new Test.Test4();   // Приватний нестатичний в межах основного
         new Test.Test5();   // Приватний статичний в межах основного
         new Test7();        // Сформований за дужкою
         */
    }

    public void action(){ // нестатичний метод

        new Test();         // Основний клас
        new Test.Test6();   // Публічний статичний в межах основного

        /**
         new Test2();        // Сформований за дужкою
         new Test.Test2();   // Публічний нестатичний в межах основного класу з однаковою назвою класа за дужкою
         new Test.Test3();   // Публічний нестатичний в межах основного класу
         new Test.Test4();   // Приватний нестатичний в межах основного
         new Test.Test5();   // Приватний статичний в межах основного
         new Test7();        // Сформований за дужкою
         */
    }
}