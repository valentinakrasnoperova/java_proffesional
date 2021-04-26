package homework4.add_task;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/user/IdeaProjects/java_professional/src/main/java/homework4/add_task/add_task.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        PrintWriter printWriter = new PrintWriter(new FileWriter(file, false));


        printWriter.write("bla");
        printWriter.flush();
        printWriter.close();


        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();


    }
}
