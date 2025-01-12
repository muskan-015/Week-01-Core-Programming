import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking month and day as input from the user
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day = sc.nextInt();

        // To Check if the date falls in the Spring season (March 20 - June 20)
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        sc.close();
    }
}
