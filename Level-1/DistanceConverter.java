class DistanceConverter {
//class to convert the distance of kilometers to miles
    public static void main(String[] args) {
        // Define variables
        double kilometers = 10.8;
        double Kilo_TO_Miles_CONVERSION_FACTOR = 1.6;

        // Perform the conversion
        double miles = kilometers / Kilo_TO_Miles_CONVERSION_FACTOR;

        // Display the result
        System.out.printf("The distance "+ kilometers+ "km in miles is "+ miles);
    }
}
