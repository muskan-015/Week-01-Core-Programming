import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        //take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the entered number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Using a for loop
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        // Close the scanner
        sc.close();
    }
}
