import java.util.Scanner;

public class CalendarDisplay {

    // Array of month names
    private static final String[] MONTHS = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array of days in each month
    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return DAYS_IN_MONTH[month - 1];
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        return MONTHS[month - 1];
    }

    // Method to calculate the first day of the month using Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);
        String monthName = getMonthName(month);

        // Print the calendar header
        System.out.printf("\n  %s %d\n", monthName, year);
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        // Add spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }

        // Print the days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%5d", day);
            if ((day + firstDay) % 7 == 0) { // Move to the next line after Saturday
                System.out.println();
            }
        }

        // Print a newline at the end of the calendar
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Validate the input
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input. Please enter a valid month and year.");
        } else {
            // Display the calendar
            displayCalendar(month, year);
        }

        scanner.close();
    }
}
