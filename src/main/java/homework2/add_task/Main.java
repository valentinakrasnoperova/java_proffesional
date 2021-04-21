package homework2.add_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String str;
        System.out.println("Enter the string : ");
        do {
            str = reader.readLine();
            if (!str.equals("end")) {
                list.add(str);
            }
        } while (!str.equals("end"));
        Collections.sort(list);
        for (String str1 : list) {
            System.out.print(str1 + "\n");
        }
        System.out.println("Size is: " + list.size());

    }

}
