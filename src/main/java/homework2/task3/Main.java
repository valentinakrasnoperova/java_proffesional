package homework2.task3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number;
        do {
            if (input.hasNextInt()) {
                number = input.nextInt();
                break;
            } else {
                System.out.println("You have entered wrong number ");
                input.nextLine();
            }
        } while (true);

        System.out.println(getIntegerList(number));

    }

    static int getMinimum(List<Integer> list) {
        Collections.sort(list);
        return list.get(0);
    }

    public static List<Integer> getIntegerList(int number) {
        List<Integer> list = new LinkedList<>();
        int number1;
        for (int i = 0; i < number; i++) {
            number1 = (int) (Math.random() * 100 + 1);
            list.add(number1);
        }
        System.out.println("Min is " + getMinimum(list));
        System.out.print("list : ");
        return list;
    }


}
