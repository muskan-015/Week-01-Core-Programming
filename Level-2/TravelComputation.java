import java.util.Scanner;

class TravelComputation {
   
   public static void main(String[] args) {
       
      //Scanner object for taking user input
      Scanner sc = new Scanner(System.in);

      // user input for the name
      String name = sc.next();
      
      // user input for the variables fromCity, viaCity and toCity
      String fromCity = sc.next();
      String viaCity = sc.next();
      String toCity = sc.next();

      // take user input for the variable distanceFromToVia and distanceViaToFinalCity in miles
      double distanceFromToVia = sc.nextDouble();
      double distanceViaToFinalCity = sc.nextDouble();

      // take user input for the variable timeFromToVia and timeViaToFinalCity in minutes
      int timeFromToVia = sc.nextInt();
      int timeViaToFinalCity = sc.nextInt();

      // Create a variable totalDistance to indicate the total distance
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Create a variable totalTime to indicate the total time taken to
      int totalTime = timeFromToVia + timeViaToFinalCity;


      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " +fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +"the Total Time taken is " + totalTime + " minutes");
   }
}
