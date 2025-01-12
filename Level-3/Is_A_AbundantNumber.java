import java.util.Scanner;

public class Is_A_AbundantNumber {

    public static void main(String[] args) {
        //Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Initialize sum to 0
        int sum = 0;

        // Loop to calculate the sum of divisors
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of the number
            if (number % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }

        // Close the Scanner
        sc.close();
    }
}
