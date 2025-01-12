import java.util.Scanner;

public class CalculateSumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Initialize the total sum
        int total = 0;
        int number;

        //  take input from the user
        System.out.println("Enter numbers to sum, and enter 0 to stop:");

        // Loop until the user enters 0
        while (true) {
            // Take input from user
            number = sc.nextInt();

            // Break the loop if the number is 0
            if (number == 0) {
                break;
            }

            // Add the number to the total
            total += number;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);
        sc.close();
    }
}
