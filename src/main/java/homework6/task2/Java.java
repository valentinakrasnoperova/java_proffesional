package homework6.task2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/user/IdeaProjects/java_professional/src/main/java/homework6/task2/java.txt");
        PrintWriter printWriter = new PrintWriter(new FileWriter(file, false));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        PrintWriter newPrintWriter = new PrintWriter(new FileWriter(file, false));
        BufferedReader newBufferedReader = new BufferedReader(new FileReader(file));
        Pattern pattern;
        Matcher matcher;
        printWriter.write("The precise date of Easter has at times been A matter of contention.It is cultural holiday of fertility!But how do rabbit and eggs relate to the Easter?");
        printWriter.flush();
        printWriter.close();


        String str = bufferedReader.readLine();
        bufferedReader.close();


        pattern = Pattern.compile("(?<!\\S)(in|at|on|with|by|a|an|the|of|and)(?!\\S)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        matcher = pattern.matcher(str);
        newPrintWriter.write(matcher.replaceAll("Java"));
        newPrintWriter.flush();
        newPrintWriter.close();

        try {
            String str2;
            while ((str2 = newBufferedReader.readLine()) != null) {
                System.out.println(str2);
            }
            newBufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
