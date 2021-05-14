package homework9.task3;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File f = new File("/home/user/IdeaProjects/java_professional/src/main/java/homework9/task3/file.txt");
        Car car = new Car("BMW", 200, 30000);

        try (ObjectOutputStream oos = new ObjectOutputStream((new FileOutputStream(f)));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {

            oos.writeObject(car);
            Car car1 = (Car) ois.readObject();
            System.out.println(car1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}