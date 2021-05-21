package homework12.task2;

import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        JacksonParser jacksonParser = new JacksonParser();
        HashMap<String,String> map = new HashMap<>();

        map.put("Country", "Ukraine");
        map.put("City","Kyiv");
        map.put("Square","Khreshatyk");

        jacksonParser.parser(map);

    }
}
