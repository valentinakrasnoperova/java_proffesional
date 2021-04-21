package homework2.task2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(10,
                new Comparator<>() {
                    @Override
                    public int compare(Integer n1, Integer n2) {
                        return n2 - n1;
                    }
                });

        for (int i = 0; i < 10; i++) {
            queue.offer((int) (Math.random() * 100));
        }

        Integer number;

        for (int i = 0; i < 9; i++) {
            number = queue.poll();
            System.out.print(number + ", ");
        }
        number = queue.poll();
        System.out.print(number);

    }

}
