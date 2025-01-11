class AverageMark {
//class to calculate average mark of Sam
    
    public static void main(String[] args) {
        // Define variables for marks in Maths, Physics, and Chemistry
        int MATHS_MARK = 94;
        int PHYSICS_MARK = 95;
        int CHEMISTRY_MARK = 96;

        // Define the total maximum marks for PCM
        int TOTAL_SUBJECTS = 3;
        int MAX_MARKS_PER_SUBJECT = 100;

        // Calculate the average percentage
        int totalMarks = MATHS_MARK + PHYSICS_MARK + CHEMISTRY_MARK;
        double averagePercentage = (double) totalMarks / (TOTAL_SUBJECTS * MAX_MARKS_PER_SUBJECT) * 100;

        // Display the result
        System.out.printf("Sam's average mark in PCM is "+ averagePercentage);
    }
}
