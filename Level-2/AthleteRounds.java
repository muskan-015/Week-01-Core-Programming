import java.util.Scanner;

public class AthleteRounds {

    public static void main(String[] args) {
        //Scanner object for taking user input
        Scanner sc = new Scanner(System.in);

        // user input for the three sides of the triangle
        System.out.print("Enter the first side of the triangle (in meters): ");
        int side1 = sc.nextInt();

        System.out.print("Enter the second side of the triangle (in meters): ");
        int side2 = sc.nextInt();

        System.out.print("Enter the third side of the triangle (in meters): ");
        int side3 = sc.nextInt();

        // Calculate the perimeter of the triangle
        int perimeter = side1 + side2 + side3;

        int totalDistance = 5000;  // (5 km = 5000 meters)

        // Calculate the number of rounds required to complete 5 km
        double rounds = (double)totalDistance / perimeter;

        // Display the result
        System.out.printf("The total number of rounds the athlete will run is "+rounds +" to complete 5 km." );

        // Close the Scanner
        sc.close();
    }
}
