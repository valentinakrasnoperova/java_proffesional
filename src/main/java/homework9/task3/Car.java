package homework9.task3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car implements Externalizable {
    String model;
    static int speed;
    static int price;

    public Car() {
    }

    public Car(String model, int speed, int price) {
        this.model = model;
        Car.speed = speed;
        Car.price = price;

    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Car.price = price;
    }

    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        Car.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model= " + model + ", speed = " + speed + ", price = " + price + "}";
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(model);
        out.writeInt(price);
        out.writeInt(speed);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        model = (String) in.readObject();
        price = in.readInt();
        speed = in.readInt();
    }
}
