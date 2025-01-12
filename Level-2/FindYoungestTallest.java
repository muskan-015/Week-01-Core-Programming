import java.util.Scanner;

public class FindYoungestTallest {

    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Create arrays to store the names, ages, and heights
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input from the user
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter the height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Variables storing the index of the youngest and tallest friend
        int yIndex = 0;
        int tIndex = 0;

        // Search for the youngest friend
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[yIndex]) {
                yIndex = i;
            }
        }

        // Search for the tallest friend
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tIndex]) {
                tIndex = i;
            }
        }

        // Display the results
        System.out.println("\nYoungest friend: " + names[yIndex]);
        System.out.println("Tallest friend: " + names[tIndex]);
    }
}
