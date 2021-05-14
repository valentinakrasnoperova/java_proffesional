package homework10.task3;

public class Eagle extends Animal {

    public Eagle() {
    }

    public Eagle(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}