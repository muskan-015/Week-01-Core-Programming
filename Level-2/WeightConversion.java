import java.util.Scanner;

class WeightConversion{
     
   public static void main(String[] args) {
       
      //Scanner object for taking user input
      Scanner sc = new Scanner(System.in);

      //user input for the weight in pounds
      System.out.print("Enter the weight: ");
      double weight = sc.nextDouble();

      //create a variable for weight in kilograms
      double weightInKilo = weight*2.2;  // 1 pound = 2.2 kg

      
      // Display the output
      System.out.println("The weight of the person in pound is "+ weight +" and in kg is "+weightInKilo);

      // Close the Scanner
      sc.close();
   }
}
