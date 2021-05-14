package homework10.task3;

import java.io.*;

public class Main {
public static void main(String[] args) {
    Eagle eagle = new Eagle("Forest eagle", 2, "white");
    try {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(eagle);
        objectOutputStream.flush();
        objectOutputStream.close();


        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Eagle clonedEagle = (Eagle) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(eagle);
        System.out.println(clonedEagle);

    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }

}
}