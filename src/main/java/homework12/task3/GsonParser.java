package homework12.task3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;

public class GsonParser {
    public void parser(HashMap<String, String> map) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();
        String string = gson.toJson(map);

        System.out.println(string);

        Files.write(Paths.get("/home/user/IdeaProjects/java_professional/src/main/java/homework12/task3/city.json"), string.getBytes(), StandardOpenOption.CREATE);
    }
}

