package homework9.task2;

import java.io.*;

public class Main {

    public static void main(String[] args) {


        File file = new File("/home/user/IdeaProjects/java_professional/src/main/java/homework9/task2/file2.txt");
        Animal animal = new Animal(5, "Cat", "black");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            oos.writeObject(animal);
            Animal animal1 = (Animal) ois.readObject();
            System.out.println(animal1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
