package homework1.task1;

public class Car implements Comparable<Car> {
    String color;
    int speed;
    int price;
    int model;

    Car(int speed, int price, int model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.speed + " " + this.price + " " + this.model + " " + this.color;
    }

    public int compareTo(Car obj) {
        int tmp = this.speed - obj.speed;

        if (tmp == 0) {
            tmp = this.price - obj.price;
        } else return tmp;

        if (tmp == 0) {
            tmp = this.model - obj.model;
        } else return tmp;

        if (tmp == 0) {
            tmp = this.color.compareTo(obj.color);
        }
        return tmp;
    }
}
