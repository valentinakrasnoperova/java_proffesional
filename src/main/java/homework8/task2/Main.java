package homework8.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/**
 * @author Valentina
 * @version 1.0
 * @since 11.05.2021
 */

public class Main {

    public static void main(String[] args) throws IOException, NoSuchMethodException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose the operation");

            Main main = new Main();
            Class<?> cl = main.getClass();
            Method method = cl.getDeclaredMethod("Calculator", int.class, int.class, String.class);
            Calculator calculator = method.getAnnotation(Calculator.class);
            main.Calculator(calculator.firstOperand(), calculator.secondOperand(), in.readLine());




    }

    @Calculator
    public void Calculator(int firstOperand, int secondOperand, String operation) {

        switch (operation) {
            case "+": {
                System.out.println("Sum = " + (firstOperand + secondOperand));
                break;
            }
            case "-": {
                System.out.println("Difference: " + (firstOperand - secondOperand));
                break;
            }
            case "*": {
                System.out.println("Multiplication: " + (firstOperand * secondOperand));
                break;
            }
            case "/": {
                try {

                    System.out.println("Division: " + (firstOperand / secondOperand));
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                    System.out.println("You can not divide by zero");
                }
                break;

            }
            default: {
                System.out.println("You have chosen wrong operation");
                break;
            }
        }

    }

}
