import java.util.Scanner;

public class smallestNumber {

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
        System.out.printf("Is the first number the smallest? "+ (number1<number2 && number1<number3));

        // Close the Scanner
        sc.close();
    }
}