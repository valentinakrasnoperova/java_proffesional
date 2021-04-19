package homework1.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(200, 70000, 250, "red");
        Car car2 = new Car(200, 50000, 250, "red");
        Car car3 = new Car(200, 70000, 300, "red");
        Car car4 = new Car(200, 70000, 250, "black");


        Car[] c = {car1, car2, car3, car4};

        Arrays.sort(c);

        for (Car tmp : c) {
            System.out.println(tmp);
        }
    }
}
