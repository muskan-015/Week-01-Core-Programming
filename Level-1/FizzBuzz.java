import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // To Check if the number is positive
        if (number <= 0) {
            System.out.println("enter a positive integer.");
            return;
        }

        // Create a String array
        String[] results = new String[number + 1];

        // iterate through numbers
        for (int i = 1; i <= number; i++) {
            // Check for multiples of 3, 5, and both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = Integer.toString(i);
               
            }
        }

        // Loop through the array and print results
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
