class CourseFeeCalculator {
//class to find the discounted amount and discounted price the student will pay for the course.

    public static void main(String[] args) {
        // Define variables
        int fee = 125000;
        int discountPercent = 10;

        // Calculate the discount amount
        double discount = ((double)fee * discountPercent) / 100;

        // Calculate the final discounted fee
        double discountedFee = fee - discount;

        // Display the results
        System.out.printf(
                "The discount amount is INR "+discount+" and the final discounted fee is INR "
                +discountedFee
        );
    }
}
