import java.util.Scanner;

public class DoubleOperation {

    public static void main(String[] args) {
        //Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // user input for a, b, and c 
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        // Perform the double operations
        double result1 = a + b * c;  
        double result2 = a * b + c;  
        double result3 = c + a / b;  
        double result4 = a % b + c;  

        // Display the results
        System.out.printf("The results of Double Operations are: "+ result1 +", " +result2+", " + result3+" and " + result4);

        // Close the Scanner
        input.close();
    }
}
