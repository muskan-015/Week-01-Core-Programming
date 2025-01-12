import java.util.Scanner;

public class MultiplicationTableOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        // create an array to store the multiplication results
        int[] Result = new int[4]; // size is 4 for the range 6 to 9

        // Calculate the multiplication table 
        for (int i = 6; i <= 9; i++) {
            Result[i - 6] = number * i;
        }

        // Display the results
        System.out.println("\nMultiplication Table:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + Result[i - 6]);
        }

        // Close the scanner to free resources
        sc.close();
    }
}
