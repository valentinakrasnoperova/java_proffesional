package homework7.task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class Main {
    public static void main(String[] args) {

        Class<?> cl1 = Car.class;
        System.out.print("Modifiers of the class: ");
        getModifierName(cl1);
        System.out.println("Fields: ");
        Field[] field = cl1.getDeclaredFields();
        int fieldModifiers;

        for (Field field1 : field) {
            fieldModifiers = field1.getModifiers();
            if (Modifier.isPrivate(fieldModifiers)) {
                System.out.print("private ");
            }
            if (Modifier.isPublic(fieldModifiers)) {
                System.out.print("public ");
            }
            if (Modifier.isProtected(fieldModifiers)) {
                System.out.println("protected ");
            }
            if (Modifier.isAbstract(fieldModifiers)) {
                System.out.print("abstract ");
            }
            if (Modifier.isStatic(fieldModifiers)) {
                System.out.print("static ");
            }
            if (Modifier.isFinal(fieldModifiers)) {
                System.out.print("final ");
            }
            if (Modifier.isSynchronized(fieldModifiers)) {
                System.out.print("synchronized ");
            }
            System.out.println(field1.getName() + " {" + field1.getType() + "}");
        }

        System.out.println("\n" + "Constructors: ");
        Constructor<?>[] constructors = cl1.getConstructors();
        int constr = 0;
        for (Constructor<?> constructor : constructors) {
            System.out.println("\n" + "Constructor" + (++constr) + ": ");
            Class<?>[] parameters = constructor.getParameterTypes();
            for (Class<?> parameter : parameters) {
                System.out.print(parameter.getName() + ", ");
            }
        }

        System.out.println("\n" + "Methods");
        Method[] mtd = cl1.getMethods();
        for (Method method : mtd) {
            System.out.print(method.getName() + " { Return type : " + method.getReturnType() + ", Parameters: ");
            Class<?>[] parametersOfMethod1 = method.getParameterTypes();
            for (Class<?> parametersOfMethod : parametersOfMethod1) {
                System.out.print(parametersOfMethod.getName() + " ");
            }
            System.out.println("}");
        }

    }

    private static void getModifierName(Class<?> cl1) {
        int mds = cl1.getModifiers();
        if (Modifier.isPrivate(mds)) {
            System.out.print("private ");
        }
        if (Modifier.isPublic(mds)) {
            System.out.println("public");
        }
        if (Modifier.isProtected(mds)) {
            System.out.println("protected");
        }
        if (Modifier.isAbstract(mds)) {
            System.out.print("abstract ");
        }
        if (Modifier.isStatic(mds)) {
            System.out.print("static ");
        }
        if (Modifier.isFinal(mds)) {
            System.out.print("final ");
        }

    }

}
