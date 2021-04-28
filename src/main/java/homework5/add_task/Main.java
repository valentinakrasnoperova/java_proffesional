package homework5.add_task;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        String sentence = "The precise date of Easter has at times been a matter of contention.It is cultural holiday of fertility!But how do rabbit and eggs relate to the Easter?";
        String[] sentence2 = sentence.split("(?<=[.!?])");
        Arrays.sort(sentence2, Comparator.comparingInt(String::length));
        for (String s : sentence2) {
            System.out.println(s);
        }


    }
}
