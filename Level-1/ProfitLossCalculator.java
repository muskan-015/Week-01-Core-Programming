public class ProfitLossCalculator {
//class to calculate profit or loss
    public static void main(String[] args) {
        // Define the cost price and selling price
        int COST_PRICE = 129;
        int SELLING_PRICE = 191;

        // Calculate profit and profit percentage
        int profit = SELLING_PRICE - COST_PRICE;
        double profitPercentage = ( (double)profit / COST_PRICE) * 100;

        // Display the result in a single multiline print statement
        System.out.printf(
                "The Cost Price is INR "+COST_PRICE+" and Selling Price is INR "+
                SELLING_PRICE+"\nThe Profit is INR "+profit+" and the Profit Percentage is "
                +profitPercentage
        );
    }
}
