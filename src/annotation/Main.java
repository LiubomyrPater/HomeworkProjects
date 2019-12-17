package annotation;
import java.io.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Service.getClassFields(new Person(), "fieldsAny.out");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("fieldsAny.out"))) {
            String[] strings = (String[]) ois.readObject();
            System.out.println(Arrays.toString(strings));
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
