class PenDistribution {
//class to distribute pen equally
    public static void main(String[] args) {
        // Total pens and number of students
        int TOTAL_PENS = 14;
        int STUDENTS = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = TOTAL_PENS / STUDENTS;
        int remainingPens = TOTAL_PENS % STUDENTS;

        // Display the result
        System.out.printf(
                "The Pen Per Student is "+pensPerStudent+" and the remaining pen not distributed is "
                +remainingPens
        );
    }
}
