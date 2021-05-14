package homework10.add_task;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 200, 30000);

        try {
            Car clonedCar = (Car) car.clone();

            System.out.println("Original: " + car);
            System.out.println("Cloned: " + clonedCar);

            ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
            ObjectOutputStream output = new ObjectOutputStream(byteOutput);

            output.writeObject(car);

            ByteArrayInputStream byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
            ObjectInputStream input = new ObjectInputStream(byteInput);

            Car clonedCar2 = (Car) input.readObject();

            System.out.println("Serialization: " + clonedCar2);

        } catch (IOException | ClassNotFoundException | CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}