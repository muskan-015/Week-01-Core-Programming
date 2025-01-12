import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the month, day, and year
        System.out.print("Enter the month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter the day (1-31): ");
        int d = sc.nextInt();

        System.out.print("Enter the year: ");
        int y = sc.nextInt();

        // Using the formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Displaying the result
        System.out.println("The day of the week is: " + d0);
        System.out.println("Where 0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday");

        sc.close();
    }
}
