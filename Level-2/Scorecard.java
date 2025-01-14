import java.util.Random;
import java.util.Scanner;

public class Scorecard {

    // Method to generate random 2-digit scores
    public static int[][] RandomScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 40 + random.nextInt(61); 
            scores[i][1] = 40 + random.nextInt(61);
            scores[i][2] = 40 + random.nextInt(61);
        }

        return scores;
    }

    // calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round(total / 3.0) ; 

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method to calculate grade based on percentage
    public static String[][] calculateGradesAndRemarks(double[][] results) {
        int numberOfStudents = results.length;
        String[][] gradesAndRemarks = new String[numberOfStudents][2];
       
        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) {
                gradesAndRemarks[i][0] = "A";
                gradesAndRemarks[i][1] = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                gradesAndRemarks[i][0] = "B";
                gradesAndRemarks[i][1] = "Level 3, agency-normalized standards";

            } else if (percentage >= 60) {
               gradesAndRemarks[i][0] = "C";
               gradesAndRemarks[i][1] = "Level 2, below, but approaching agency-normalized standards";

            } else if (percentage >= 50) {
                gradesAndRemarks[i][0] = "D";
                gradesAndRemarks[i][1] = "Level 1, well below agency-normalized standards";

            } else if (percentage >= 40) {
                gradesAndRemarks[i][0] = "E";
                gradesAndRemarks[i][1] = "Level 1-, too below agency-normalized standards";

            } else {
                gradesAndRemarks[i][0] = "R";
                gradesAndRemarks[i][1]= "remedial standards";

            }
        }

        return gradesAndRemarks;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScore(int[][] scores, double[][] results, String[][] gradesAndRemarks) {
        System.out.println("Student  Physics  Chemistry  Math  Total  Average  Percentage  Grade  Remarks");
        System.out.println("------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1)+" "+scores[i][0]+" "+ scores[i][1]+" "+ scores[i][2]+" "+ results[i][0]+" "+ results[i][1]+" "+results[i][2]+" "+gradesAndRemarks[i][0]+" "+ gradesAndRemarks[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        if (numberOfStudents <= 0) {
            System.out.println("Invalid number of students");
            return;
        }

        // Generate random scores for students
        int[][] scores = RandomScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Calculate grades
        String[][] gradesAndRemarks = calculateGradesAndRemarks(results);

        // Display the scorecard
        displayScore(scores, results, gradesAndRemarks);

        sc.close();
    }
}
