class AgeCalculation {
//class to compute Harry's age
   
    public static void main(String[] args) {
        // Varibles for the current year and Harry's birth year
        int Birth_year = 2000;
        int Current_year = 2024;

        // Calculate Harry's age
        int age = Current_year - Birth_year;

        // Display the result
        System.out.println("Harry's age in " + Current_year + " is " + age);
    }
}