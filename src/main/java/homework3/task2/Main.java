package homework3.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        String str;
        map.put("Ivanovth", "Moscow");
        map.put("Petrovth", "Kyiv");
        map.put("Simpsonth", "London");

        int count = 0;
        System.out.println("Enter the family's surname: ");
        str = reader.readLine();
        for (Map.Entry<String, String> map1 : map.entrySet()) {
            if (map1.getKey().equals(str)) {
                System.out.println(map1.getKey() + " the city they live in : " + map1.getValue());
                count++;
            }
        }
        if ((count == 0)) {
            System.out.println("We can not find that family");
        }


    }


}
