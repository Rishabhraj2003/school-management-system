package util;

import java.io.*;

public class FileUtil {

    public static void saveObject(Object obj, String fileName) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(obj);
        } catch (Exception e) {
            System.out.println("Error saving data");
        }
    }

    public static Object loadObject(String fileName) {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {
            return ois.readObject();
        } catch (Exception e) {
            return null;
        }
    }
}
