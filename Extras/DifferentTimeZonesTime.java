import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DifferentTimeZonesTime {
    public static void main(String[] args) {
        // Get the current time in different time zones
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // display
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        // Display the time in each time zone
        System.out.println("Current Time in Different Time Zones:");
        System.out.println("GMT: " + gmtTime.format(formatter));
        System.out.println("IST: " + istTime.format(formatter));
        System.out.println("PST: " + pstTime.format(formatter));
    }
}
