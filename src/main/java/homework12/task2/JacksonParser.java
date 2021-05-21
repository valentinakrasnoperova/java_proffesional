package homework12.task2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;

public class JacksonParser {
    public void parser(HashMap<String, String> map) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String str = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

        System.out.println(str);

        Files.write(Paths.get("/home/user/IdeaProjects/java_professional/src/main/java/homework12/task2/task2.json"), str.getBytes(), StandardOpenOption.CREATE);

    }


}
