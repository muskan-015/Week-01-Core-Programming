import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner sc = new Scanner(System.in);

        // date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Input first date
        System.out.print("Enter the first date (dd-MM-yyyy): ");
        String Date1 = sc.nextLine();
        LocalDate date1 = LocalDate.parse(Date1, formatter);

        // Input second date
        System.out.print("Enter the second date (dd-MM-yyyy): ");
        String Date2 = sc.nextLine();
        LocalDate date2 = LocalDate.parse(Date2, formatter);

        // Compare the two dates
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("The first date is the same as the second date.");
        }

        // Close the scanner
        sc.close();
    }
}
