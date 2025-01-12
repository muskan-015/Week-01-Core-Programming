import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Initialize the total sum
        double total = 0;
        double number;

        //  take input from the user
        System.out.println("Enter numbers to sum, and enter 0 to stop:");
        number = sc.nextDouble();


        // Loop until the user enters 0
        while (number!=0) {
            
            // Add the number to the total
            total += number;
            //Take next input from the user
            number = sc.nextDouble();
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);
        sc.close();
    }
}
