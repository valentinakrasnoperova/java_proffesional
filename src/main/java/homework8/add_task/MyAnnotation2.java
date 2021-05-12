package homework8.add_task;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyAnnotation1.class)
public @interface MyAnnotation2 {
    int num1() default 5 ;
    int num2() default 100;
}