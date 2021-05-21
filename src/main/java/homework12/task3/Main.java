package homework12.task3;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        GsonParser gsonParser = new GsonParser();
        HashMap<String,String> map = new HashMap<>();

        map.put("Country", "Ukraine");
        map.put("City","Kyiv");
        map.put("Square","Khreshatyk");


        gsonParser.parser(map);
    }
}