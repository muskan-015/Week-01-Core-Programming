import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int num_Persons = sc.nextInt();

        // Create a multi-D array to store weight, height, and BMI
        // Data[i][0] -> height, Data[i][1] -> weight, Data[i][2] -> BMI
        double[][] Data = new double[num_Persons][3];
        
        // Array to store weight status of the persons
        String[] status = new String[num_Persons];

        // Take input for weight and height of each person
        for (int i = 0; i < num_Persons; i++) {
            System.out.println("\nPerson " + (i + 1));

            // input the weight for the person
            double weight;
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value.");
                }
            } while (weight <= 0);

            // take the height for the person
            double height;
            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value.");
                }
            } while (height <= 0);

            // Store weight and height in the multi-D array
            Data[i][0] = height;
            Data[i][1] = weight;

            // Calculate BMI
            Data[i][2] = weight / (height * height);

            // Determine the weight status based on BMI
            if (Data[i][2] <= 18.4) {
                status[i] = "Underweight";
            } else if (Data[i][2] >= 18.5 && Data[i][2] <= 24.9) {
                status[i] = "Normal";
            } else if (Data[i][2] >= 25.0 && Data[i][2] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status for each person
        System.out.println("\nPerson Information:\n");
        System.out.println("No.\tHeight (m)\tWeight (kg)\tBMI\t\tStatus");

        for (int i = 0; i < num_Persons; i++) {
            System.out.printf(""+(i + 1) +"\t"+Data[i][0] +"\t\t"+Data[i][1] +"\t\t"+Data[i][2] +"\t\t"+status[i] +"\n" );
        }

        // Close the scanner
        sc.close();
    }
}
