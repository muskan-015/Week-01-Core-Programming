import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        //To Check if the input is a natural number
        if (number <= 0) {
            System.out.println("enter a natural number.");
            sc.close();
            return;
        }

        // Create arrays to store odd and even numbers
        int[] evenNumber = new int[number / 2 + 1];
        int[] oddNumber = new int[number / 2 + 1];
        int eIndex = 0;
        int oIndex = 0;

        // Iterate and separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumber[eIndex++] = i; 
            } else {
                oddNumber[oIndex++] = i; 
            }
        }

        // print the odd numbers array
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oIndex; i++) {
            System.out.print(oddNumber[i] + " ");
        }

        // print the even numbers array
        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < eIndex; i++) {
            System.out.print(evenNumber[i] + " ");
        }

        // Close the scanner
        sc.close();
    }
}
