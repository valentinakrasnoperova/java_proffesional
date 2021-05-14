package homework10.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Max", 2);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(bird);
            objectOutputStream.flush();
            objectOutputStream.close();


            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Bird clonedBird = (Bird) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(bird);
            System.out.println(clonedBird);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}