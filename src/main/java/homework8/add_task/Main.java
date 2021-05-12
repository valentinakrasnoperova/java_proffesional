package homework8.add_task;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Main main = new Main();
        Class<?> cl = main.getClass();
        Method met = cl.getDeclaredMethod("mathSum", int.class, int.class);
        MyAnnotation1 annotation = met.getAnnotation(MyAnnotation1.class);
        MyAnnotation2[] annotation2 = annotation.value();

        main.mathSum(annotation2[0].num1(), annotation2[1].num2());


    }

    @MyAnnotation2
    @MyAnnotation2
    public void mathSum(int num1, int num2) {
        System.out.println("Sum : " + (num1 + num2));
    }
}