package homework7.task2;

import java.util.Scanner;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Enter the path of the class: ");//for example : java.io.InputStreamReader
        try {
            Scanner scanner = new Scanner(System.in);
            String className = scanner.next();
            Class<?> cl = Class.forName(className);
            System.out.println(cl);
            System.out.println("\n" + "Fields:");
            Field[] fl = cl.getDeclaredFields();
            for (Field field : fl) {

                System.out.println(field.getName() + " {" + field.getType() + "}");
            }
            System.out.println("\n" + "Constructors");
            Constructor<?>[] constructors = cl.getConstructors();
            int constr = 0;
            for (Constructor<?> constr1 : constructors) {
                System.out.println("\n" + "Constructor " + (++constr) + ": ");
                Class<?>[] parameters = constr1.getParameterTypes();
                for (Class<?> parameter : parameters) {
                    System.out.print(parameter.getName() + " ");
                }
            }
            System.out.println("\n" + "Methods");
            Method[] methods = cl.getMethods();
            for (Method method : methods) {
                System.out.print(method.getName() + " {Return type: " + method.getReturnType() + ", Parameters: ");
                Class<?>[] parametersOfMethod = method.getParameterTypes();
                for (Class<?> parametersOfMethod1 : parametersOfMethod) {
                    System.out.print(parametersOfMethod1.getName() + ", ");
                }
                System.out.println("}");
            }

        } catch (Exception e) {
            System.out.println("Unknown class");
        }

    }


}


