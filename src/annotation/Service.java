package annotation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;

public abstract class Service {
    public static void getClassFields(Object instance, String fileName){

        Class<?> some = instance.getClass();

        Field[]fields = some.getDeclaredFields();
        int number = 0;
        for (Field f : fields) {
            if (f.isAnnotationPresent(Serialize.class))
                number ++;
        }

        String[]fieldName = new String[number];
        int count = 0;
        for (Field field : fields) {
            if (field.isAnnotationPresent(Serialize.class)) {
                fieldName[count] = field.getName();
                count++;
            }
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(fieldName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
