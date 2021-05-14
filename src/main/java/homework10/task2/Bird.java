package homework10.task2;

import java.io.Serializable;

public class Bird implements Serializable {
    static String breed;
    transient int weight;
    final int age = 5;

    public Bird() {
    }

    public Bird(String breed, int weight) {
        Bird.breed = breed;
        this.weight = weight;
    }

    public static String getBreed() {
        return breed;
    }

    public static void setBreed(String breed) {
        Bird.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bird{" + "breed=" + breed +
                ", weight= " + weight + "kg"+
                ", age= " + age + '\'' +
                '}';
    }
}