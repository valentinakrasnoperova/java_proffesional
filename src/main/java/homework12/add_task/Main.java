package homework12.add_task;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Parser.parseJson("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
    }
}