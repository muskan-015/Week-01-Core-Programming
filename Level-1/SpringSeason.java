import java.util.Scanner;

public class SpringSeason {
    // Method to check if the date falls in the Spring Season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20 && day <= 31) || 
            (month == 4 && day >= 1 && day <= 30) ||  
            (month == 5 && day >= 1 && day <= 31) ||  
            (month == 6 && day >= 1 && day <= 20)) {  
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input for month and day from the user
        System.out.println("Enter the month (1-12):");
        int month = sc.nextInt();

        System.out.println("Enter the day (1-31):");
        int day = sc.nextInt();

        // Check if it's Spring Season
        boolean isSpring = isSpringSeason(month, day);

        // Output result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }

    
}
