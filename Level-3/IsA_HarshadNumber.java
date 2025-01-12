import java.util.Scanner;

public class IsA_HarshadNumber {

    public static void main(String[] args) {
        //Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //user input for the number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Store the original number in another variable
        int originalNumber = number;

        // Initialize sum to 0
        int sum = 0;

        // Loop to calculate the sum of digits
        while (number != 0) {
            // Find the last digit of the number
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // To check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }

        // Close the Scanner
        sc.close();
    }
}
