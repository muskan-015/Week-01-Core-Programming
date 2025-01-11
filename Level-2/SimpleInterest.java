import java.util.Scanner;

class SimpleInterest{
     
   public static void main(String[] args) {
       
      //Scanner object for taking user input
      Scanner sc = new Scanner(System.in);

      //user input for the principal ,rate and time
      System.out.print("Enter the principal: ");
      double principal = sc.nextDouble();

      System.out.print("Enter the rate of interest: ");
      int rate = sc.nextInt();

      System.out.print("Enter the time: ");
      int time = sc.nextInt();

      //create a variable for calculating simple interest
      double SimpleInterest = principal*rate*time/100;
      
      // Display the simple interest
      System.out.println("The simple interest is "+ SimpleInterest +" for principal "+principal +" , rate of interest "+rate + " and time "+ time);

      // Close the Scanner
      sc.close();
   }
}
