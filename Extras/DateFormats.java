import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormats {
    public static void main(String[] args) {
        // Get the current date
        LocalDate Date = LocalDate.now();

        //different date formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display the current date in different formats
        System.out.println("Current Date in Different Formats:");
        System.out.println("(dd/MM/yyyy): " + Date.format(format1));
        System.out.println("(yyyy-MM-dd): " + Date.format(format2));
        System.out.println("(EEE, MMM dd, yyyy): " + Date.format(format3));
    }
}
