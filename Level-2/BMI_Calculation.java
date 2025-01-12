import java.util.Scanner;

public class BMI_Calculation {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the number of persons: ");
        int num_Persons = sc.nextInt();

        // Create arrays to store weight, height, BMI, and weight status
        double[] weights = new double[num_Persons];
        double[] heights = new double[num_Persons];
        double[] bmi = new double[num_Persons];
        String[] weightStatus = new String[num_Persons];

        // Take input from user
        for (int i = 0; i < num_Persons; i++) {
            System.out.println("\nPerson " + (i + 1));

            // input the weight and height for the person
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();

            // Calculate the BMI
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            // Determine the status
            if (bmi[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the result
        System.out.println("\nDtails of Person:\n");
        System.out.println("No.\tHeight (m)\tWeight (kg)\tBMI\t\tStatus");

        for (int i = 0; i < num_Persons; i++) {
            System.out.printf((i + 1)+"\t"+ heights[i] +"\t\t"+weights[i] +"\t\t"+bmi[i] +"\t\t"+weightStatus[i] +"\n");
        }

        // Close the scanner
        sc.close();
    }
}
