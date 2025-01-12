import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        //Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize a variable sum to 0 and store the original number
        int sum = 0;
        int originalNumber = number;

        // traverse each digit of the number
        while (originalNumber != 0) {
            //To find the last digit of the number
            int remainder = originalNumber % 10;

            // Add the cube of the digit to the sum
            sum += Math.pow(remainder, 3);

            // Remove the last digit from the number
            originalNumber /= 10;
        }

        // To check if the sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the Scanner
        sc.close();
    }
}
