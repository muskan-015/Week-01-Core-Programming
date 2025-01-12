import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // To Check if the number is a natural number
        if (number > 0) {
            // Calculate the sum of n natural numbers
            int sum = number * (number + 1) / 2;

            // Output the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // If not a natural number
            System.out.println("The number " + number + " is not a natural number.");
        }

        sc.close();
    }
}
