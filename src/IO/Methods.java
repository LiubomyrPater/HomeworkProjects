package IO;

//        Створити клас Methods де описати всього два методи serialize() and deserealize().
//        В даних методах повинно бути бути використано FileInputStream/FileOutputStream, ObjectInputStream/ObjectOutputStream.

import java.io.*;

public abstract class Methods{


    public static void serialize(Object o, String fileName){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object deserialize(String fileName){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
