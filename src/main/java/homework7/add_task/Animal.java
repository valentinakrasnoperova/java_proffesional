package homework7.add_task;

public class Animal {
    public String breed = "maincoon";
    private int age = 3;
    protected String name = "Ginger";

    public Animal(String breed, int age, String name) {
        this.breed = breed;
        this.age = age;
        this.name = name;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
