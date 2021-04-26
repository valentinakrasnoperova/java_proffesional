package homework4.task3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        String path = "/home/user/IdeaProjects/java_professional/src/main/java/homework4/task3/third_task.txt";
        if(Files.exists(Path.of(path))){
            Files.delete(Path.of(path));
        }
        Files.createFile(Path.of(path));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));

        int[] arr = new int[random.nextInt(50)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt((100)-10);
        }
        for (int i : arr) {
            bufferedWriter.write(i + " ");
        }
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));

        String str;
        System.out.println(str = bufferedReader.readLine());
        if (!bufferedReader.ready()) {
            bufferedReader.close();
        }

        String[] str1 = str.split(" ");
        int[] newArr = new int[str1.length];

        for (int i = 0; i < str1.length; i++) {
            newArr[i] = Integer.parseInt(str1[i]);
        }
        Arrays.sort(newArr);
        System.out.println("Sorted numbers: ");
        for (int ar : newArr) {
            String s = ar + " ";
            System.out.print(s);
        }

    }
}
