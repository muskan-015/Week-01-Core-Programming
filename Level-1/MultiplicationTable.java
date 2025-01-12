import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check input
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // create an integer array to store the results of multiplication
            int[] table = new int[10];

            // Calculate the multiplication table
            for (int i = 1; i <= 10; i++) {
                table[i - 1] = number * i;
            }

            // Display the multiplication table
            System.out.println("\nMultiplication Table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.printf(number + " * "+i +" = "+ table[i - 1]+"\n");
            }
        }

        // Close the scanner
        sc.close();
    }
}
