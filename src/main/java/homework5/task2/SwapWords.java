package homework5.task2;


public class SwapWords {

    public static void main(String[] args) {
        String sentence1 = "The precise date of Easter has at times been a matter of contention.It is cultural holiday of fertility!But how do rabbit and eggs relate to the Easter?";
        String[] sentence2 = sentence1.split("(?<=[.!?])");
        System.out.println("Text: " + "\n" + sentence1 + "\n" + "Result: ");
        for (String str : sentence2) {
            String newSentence = str.trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$2$1$4");
            System.out.println(newSentence);
        }

    }
}