import java.util.Scanner;

public class KilometerToMileConverter {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble(); // Read user input

        // Conversion factor: 1 mile = 1.6 kilometers
        double KM_TO_MILE_CONVERSION_FACTOR = 1.6;

        // Calculate the distance in miles
        double miles = km / KM_TO_MILE_CONVERSION_FACTOR;

        // Display the result
        System.out.printf("The total miles is "+ miles+"miles for the given "+ km+"km");

        // Close the Scanner
        input.close();
    }
}
