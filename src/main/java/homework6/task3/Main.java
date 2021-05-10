package homework6.task3;


import java.time.LocalDateTime;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current date is: " + localDateTime);
        
        Calendar currentCalendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        calendar2.set(Calendar.YEAR, 1979);
        calendar2.set(Calendar.MONTH, 9);
        calendar2.set(Calendar.DATE, 12);
        calendar2.set(Calendar.HOUR_OF_DAY, 3);
        calendar2.set(Calendar.MINUTE, 0);
        calendar2.set(Calendar.SECOND, 2);

        calendar1.set(Calendar.YEAR, currentCalendar.get(Calendar.YEAR) - calendar2.get(Calendar.YEAR));
        calendar1.set(Calendar.MONTH, currentCalendar.get(Calendar.MONTH) - calendar2.get(Calendar.MONTH));
        calendar1.set(Calendar.DAY_OF_MONTH, currentCalendar.get(Calendar.DAY_OF_MONTH) - calendar2.get(Calendar.DAY_OF_MONTH));
        calendar1.set(Calendar.HOUR_OF_DAY, currentCalendar.get(Calendar.HOUR_OF_DAY) - calendar2.get(Calendar.HOUR_OF_DAY));
        calendar1.set(Calendar.MINUTE, currentCalendar.get(Calendar.MINUTE) - calendar2.get(Calendar.MINUTE));
        calendar1.set(Calendar.SECOND, currentCalendar.get(Calendar.SECOND) - calendar2.get(Calendar.SECOND));

        System.out.println("You have turned: " + calendar1.get(Calendar.YEAR) + " years " + calendar1.get(Calendar.MONTH) + " months " + calendar1.get(Calendar.DAY_OF_MONTH) + " days " + calendar1.get(Calendar.HOUR_OF_DAY) + " hours " + calendar1.get(Calendar.MINUTE) + " minutes " + calendar1.get(Calendar.SECOND) + " seconds");
    }

}
