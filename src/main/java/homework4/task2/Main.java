package homework4.task2;

import java.io.IOException;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/user/IdeaProjects/java_professional/src/main/java/homework4/task2/second_task.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
        bufferedReader.close();

        PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
        printWriter.println("Hello world");
        printWriter.flush();
        printWriter.close();
    }
}
