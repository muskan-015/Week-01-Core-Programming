import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        // create an array 
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Infinite loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // Break the loop
            if (input <= 0) {
                break;
            }

            // Store the input
            if (index < 10) {
                numbers[index] = input;
                index++;
            } else {
                System.out.println("Array is full.");
                break;
            }
        }

        // Calculate the sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display the total sum
        System.out.println("\nTotal sum : " + total);

        // Close the scanner
        sc.close();
    }
}
