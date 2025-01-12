import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        // Create an array to store the heights
        double[] height = new double[11];
        double sum = 0.0;

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // take height input from the user
        System.out.println("Enter the heights of players:");
        for (int i = 0; i < height.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            height[i] = sc.nextDouble();
            sum += height[i]; // Add the height
         }
        // Calculate the mean height
        double mean = sum / height.length;

        // Display the result
        System.out.printf("\nThe mean height of the football team is: "+mean +" meters\n" );

        // Close the scanner
        sc.close();
    }
}
