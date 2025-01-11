import java.util.Scanner;

public class DistanceConversion {

    public static void main(String[] args) {
        // Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // user input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distInFeet = input.nextDouble();  

        // Conversion factors
        double Feet_To_Yard = 1.0 / 3.0;  // 1 yard = 3 feet
        double Yards_In_Mile = 1760.0;  // 1 mile = 1760 yards

        // Convert feet to yards
        double distInYards = distInFeet * Feet_To_Yard;

        // Convert yards to miles
        double distInMiles = distInYards / Yards_In_Mile;

        // Display the results
        System.out.printf("The distance in feet is "+distInFeet +"feet, in yards is "+distInYards +"yards, and in miles is "+distInMiles +"miles" );

        // Close the Scanner
        input.close();
    }
}
