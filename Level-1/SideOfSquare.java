import java.util.Scanner;

public class SideOfSquare {

    public static void main(String[] args) {
        //Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        //user input for the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate the side of the square
        double side = perimeter / 4;

        // Display the result
        System.out.printf("The length of the side is "+side+" whose perimeter is "+perimeter );

        // Close the Scanner
        input.close();
    }
}
