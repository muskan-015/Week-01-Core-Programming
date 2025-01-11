import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        // Scanner object for taking user input
        Scanner sc = new Scanner(System.in);

        //user input for number1
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        //user input for number2
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Swapping the values 
        int temp = number1;  
        number1 = number2;   
        number2 = temp;      

        // Display the swapped numbers
        System.out.printf("The swapped numbers are "+number1 +" and "+ number2);

        // Close the Scanner
        sc.close();
    }
}
