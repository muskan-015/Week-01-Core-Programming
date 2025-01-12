import java.util.Scanner;

public class FindLargestAndSecondLargest {

    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define the maxDigit size and create the array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to store digits
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;  
            number /= 10;  
            index++;
        }

        // Variables to store the largest and second largest elements
        int largest = -1;
        int secondLargest = -1;

        // Loop through the digits array
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
