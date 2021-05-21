package homework12.add_task;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Parser {
    public static void parseJson(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString;

        Currency[] currency = objectMapper.readValue(new URL(url), Currency[].class);

        for (Currency currency1 : currency) {
            System.out.println(currency1);
        }

        jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(currency);


        System.out.println("\n" + jsonString);

        Files.write(Paths.get("/home/user/IdeaProjects/java_professional/src/main/java/homework12/add_task/add_task.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);
    }
}