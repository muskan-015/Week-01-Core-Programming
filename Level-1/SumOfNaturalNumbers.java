import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();

        // To Check if the input is a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // calculate the sum using the formula n*(n+1)/2
            int formulaSum = n * (n + 1) / 2;

            // calculate the sum using a while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Compare both sums
            System.out.println("Sum using formula (n*(n+1)/2): " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("The computations are incorrect.");
            }
        }

        // Close the scanner
        sc.close();
    }
}
