package homework5.task3;

public class Split {
    public static void main(String[] args) {

        String sentence1 = "The precise date of Easter has at times been a matter of contention.";
        StringBuilder sentence2 = new StringBuilder(sentence1);
        StringBuilder stringBuilder = new StringBuilder(sentence1.length());
        System.out.println(stringBuilder.append(sentence2.substring(0, sentence2.length() / 2)).append("\n").append(sentence2.substring(sentence2.length() / 2 + 1, sentence2.length())));

    }
}
