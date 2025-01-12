import java.util.Scanner;

public class SearchLargestAndSecondLargest {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define the initial maxDigit size and initialize the array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to store digits
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10; // Increase the size by 10
                // Create a new array with increased size
                int[] newArray = new int[maxDigit];
                // Copy the contents
                System.arraycopy(digits, 0, newArray, 0, digits.length);
                // Assign the new array back to the digits array
                digits = newArray;
            }

            // find the last digit and store it in the array
            digits[index] = number % 10;
            number /= 10;  
            index++;
        }

        // Variables to store the largest and second largest elements
        int largest = -1;
        int secondLargest = -1;

        // Loop through the digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // print the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
