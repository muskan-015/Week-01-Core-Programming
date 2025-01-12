import java.util.Scanner;

public class largestNumber {

    public static void main(String[] args) {
        //Scanner object for taking user input
        Scanner sc = new Scanner(System.in);

        //user input for the number
        System.out.print("Enter the number 1: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the number 2: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the number 3: ");
        int number3 = sc.nextInt();


        // Display the result
        System.out.printf("Is the first number the largest? "+ (number1>number2 && number1>number3));
        System.out.printf("\nIs the second number the largest? "+ (number2>number1 && number2>number3));
        System.out.printf("\nIs the third number the largest? "+ (number3>number1 && number3>number2));

        // Close the Scanner
        sc.close();
    }
}