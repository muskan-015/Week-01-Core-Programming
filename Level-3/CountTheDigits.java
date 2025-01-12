import java.util.Scanner;

public class CountTheDigits {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //user input for the number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Initialize count to 0
        int count = 0;

        // If the number is 0, then count of digit is one
        if (number == 0) {
            count = 1;
        } else {
            //loop to count the digits
            while (number != 0) {
                // Remove the last digit from the number
                number /= 10;

                // Increment the count
                count++;
            }
        }

        // Display the number of digits
        System.out.println("The number of digits is: " + count);

        // Close the Scanner
        sc.close();
    }
}
