import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int num_Students = sc.nextInt();

        // Create arrays to store marks, percentages, and grades
        double[][] marks = new double[num_Students][3]; 
        double[] percentages = new double[num_Students];
        String[] grades = new String[num_Students];

        // Take input for marks of each student
        for (int i = 0; i < num_Students; i++) {
            System.out.println("\nStudent " + (i + 1));

            // Get the marks for each subject
            for (int j = 0; j < 3; j++) {
                double mark;
                do {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.print("Enter " + subject + " marks for student " + (i + 1) + ": ");
                    mark = sc.nextDouble();
                    if (mark < 0) {
                        System.out.println("Marks must be positive.");
                    }
                } while (marks[i][j] < 0);
                marks[i][j] = mark;  
            }

            // Calculate the percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2]; 
            percentages[i] = totalMarks / 3;
            // Determine the grade based on the percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display the result
        System.out.println("\nStudent Information:");
        System.out.println("No.\tPhysics\tChemistry\tMaths\tPercentage\tGrade");

        for (int i = 0; i < num_Students; i++) {
            System.out.printf((i + 1)+"\t"+marks[i][0] +"\t"+ marks[i][1] +"\t"+marks[i][2] +"\t"+percentages[i] +"\t\t"+grades[i] +"\n" );
        }

        // Close the scanner
        sc.close();
    }
}
