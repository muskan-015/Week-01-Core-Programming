import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateArithmetic {
    public static void main(String[] args) {
        // Input date
        String input = "16-01-2025"; 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(input, formatter);
        System.out.println("Original Date: " + date.format(formatter));

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After Adding 7 Days, 1 Month, and 2 Years: " + updatedDate.format(formatter));

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);
        System.out.println("After Subtracting 3 Weeks: " + finalDate.format(formatter));
    }
}
