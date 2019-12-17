package annotation;


import java.io.*;
import java.lang.reflect.Field;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Class<?> some = new Person().getClass();

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


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("fieldsAny.out"))) {
            oos.writeObject(fieldName);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("fieldsAny.out"))) {
            String[] strings = (String[]) ois.readObject();
            System.out.println(Arrays.toString(strings));
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
