import java.util.Scanner;

public class Quotient_Remainder_Calculator {

    public static void main(String[] args) {
        // Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();  

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();  

        // Calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display the result
        System.out.printf("The Quotient is "+quotient +" and Remainder is "+remainder +" of two numbers "+number1 +" and "+number2);

        // Close the Scanner
        input.close();
    }
}
