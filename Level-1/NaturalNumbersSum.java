import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        //take user input
        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // calculate the sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // calculate the sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Compare both sums and displaying the result
            System.out.println("Sum using formula (n*(n+1)/2): " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

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
