import java.util.Scanner;

public class FibonacciSeries {

    // method to calculate and print the Fibonacci sequence
    public static void Fibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Number of terms should be a positive number");
            return;
        }

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci sequence: " );

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            // Calculate next term
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            sc.next(); 
            System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        }

        int terms = sc.nextInt();

        // Call the function
        Fibonacci(terms);

        sc.close();
    }
}
