package homework8.task3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

/**
 * @author Valentina
 * @version 1.0
 * @since 11.05.2021
 */

public class Main {
    public static void main(String[] args) {

        FirstClass firstClass = new FirstClass();
        Class<?> cl = firstClass.getClass();
        Annotation[] annotations = cl.getAnnotations();

        System.out.println(cl.getName() + "\n" + "Annotations:");
        for (Annotation annotation : annotations) {
            System.out.println("\t" + annotation);
        }
        Method[] classMethods = cl.getMethods();
        System.out.println("\n" + "Annotations of the method: ");

        for (Method method : classMethods) {
            Annotation[] methodAnnotations = method.getAnnotations();
            if (methodAnnotations.length > 0) {
                System.out.println("\t" + method.getName());
            }
            for (Annotation annotation : methodAnnotations) {
                System.out.println("\t" + annotation);
            }
        }

        System.out.println("\n" + "Fields: ");
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] fieldAnnotationsFields = field.getAnnotations();
            if (fieldAnnotationsFields.length > 0) {
                System.out.println("\t" + field.getName());
            }
            for (Annotation annotationField : fieldAnnotationsFields) {
                System.out.println("\t" + annotationField);
            }
        }


    }
}