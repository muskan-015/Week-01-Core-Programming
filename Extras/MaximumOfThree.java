import java.util.Scanner;

public class MaximumOfThree {

    // method to take integer input from the user
    public static int getInput(Scanner sc, String input) {
        System.out.print(input);
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            sc.next(); 
            System.out.print(input);
        }
        return sc.nextInt();
    }

    // Function to calculate the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three integers:");

        // Take integer inputs
        int num1 = getInput(sc, "Enter the first number: ");
        int num2 = getInput(sc, "Enter the second number: ");
        int num3 = getInput(sc, "Enter the third number: ");

        // print the maximum number
        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum number is: " + max);

        sc.close();
    }
}
