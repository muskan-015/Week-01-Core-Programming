import java.util.Scanner;

public class DivisibleBy5 {

    public static void main(String[] args) {
        //Scanner object for taking user input
        Scanner sc = new Scanner(System.in);

        //user input for the number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Display the result
        System.out.printf("Is the number "+number +" divisible by 5? "+ (number%5==0));

        // Close the Scanner
        sc.close();
    }
}