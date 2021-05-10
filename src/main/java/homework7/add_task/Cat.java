package homework7.add_task;

import java.lang.reflect.Constructor;

public class Cat {
    public static void main(String[] args) {
        Class<?> cl = Animal.class;
        try {
            Constructor<?> ctr1 = cl.getConstructor(String.class, int.class, String.class);
            Constructor<?> ctr2 = cl.getConstructor();

            Animal animal1 = (Animal) ctr2.newInstance();
            System.out.println("Started fields: ");
            System.out.println("Breed : " + animal1.getBreed());
            System.out.println("Age : " + animal1.getAge());
            System.out.println("Name : " + animal1.getName());

            Animal animal2 = (Animal) ctr1.newInstance("Scotland", 5, "Ammy");
            System.out.println("\n" + "Changed fields : ");
            System.out.println("Breed : " + animal2.getBreed());
            System.out.println("Age :  " + animal2.getAge());
            System.out.println("Name : " + animal2.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
