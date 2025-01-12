import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Convert the number to a string to count digits easily
        String numString = Integer.toString(number);

        // Create an array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Loop through each digit of the number
        for (int i = 0; i < numString.length(); i++) {
            // Get the digit as a character and convert it to an integer
            char digitChar = numString.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            // Increase the frequency of the corresponding digit
            frequency[digit]++;
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }

        // Close the scanner
        sc.close();
    }
}
