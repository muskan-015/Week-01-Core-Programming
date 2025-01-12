import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create a 2D array to store marks for Physics, Chemistry, and Maths
        // marks[i][0] -> Physics, marks[i][1] -> Chemistry, marks[i][2] -> Maths
        double[][] marks = new double[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Take input for marks of each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1));

            // Get the marks for each subject and validate positive input
            for (int j = 0; j < 3; j++) {
                double mark;
                do {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.print("Enter " + subject + " marks for student " + (i + 1) + ": ");
                    mark = scanner.nextDouble();
                    if (mark < 0) {
                        System.out.println("Marks must be positive. Please enter again.");
                    }
                } while (mark < 0); // Ensure positive marks
                marks[i][j] = mark;  // Store the marks in the array
            }

            // Calculate the percentage for the student
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2]; // Sum of marks
            percentages[i] = (totalMarks / 300) * 100;  // Percentage calculation

            // Determine the grade based on the percentage
            if (percentages[i] >= 90) {
                grades[i] = "A+";
            } else if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        // Display the marks, percentages, and grades for each student
        System.out.println("\nStudent Information:");
        System.out.println("No.\tPhysics\tChemistry\tMaths\tPercentage\tGrade");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%.2f\t\t%s\n", 
                              (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
