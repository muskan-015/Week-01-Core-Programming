import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //Find the count of digits in the number
        int temp = number;
        int digitCount = 0;

        while (temp != 0) {
            temp /= 10;
            digitCount++;
        }

        // Store the digits of the number in an array
        int[] digits = new int[digitCount];
        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }

        //Reverse the digits and display the array
        System.out.print("Reversed number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
