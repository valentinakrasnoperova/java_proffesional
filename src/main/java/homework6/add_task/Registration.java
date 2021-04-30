package homework6.add_task;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        Pattern pattern1 = Pattern.compile("[a-z]+", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Pattern pattern2 = Pattern.compile("[a-z0-9]+", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        String login;
        String password;
        Matcher matcher1;
        Matcher matcher2;

        do {
            System.out.println("Enter login: ");
            login = input.next();
            matcher2 = pattern1.matcher(login);
            if (matcher2.matches()) {
                System.out.println("Enter password: ");
                password = input.next();
                matcher1 = pattern2.matcher(password);
                if (matcher1.matches()) {
                    System.out.println("Login: " + login + ", password: " + password);
                    break;
                } else {
                    System.out.println("Wrong password");
                }
            } else {
                System.out.println("Wrong login");
            }
        } while (true);
    }
}
