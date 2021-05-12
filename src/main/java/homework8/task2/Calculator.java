package homework8.task2;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Calculator {
    int firstOperand() default 10;
    int secondOperand() default 15;
}