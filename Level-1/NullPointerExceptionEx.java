public class NullPointerExceptionEx {
    // Method to generate NullPointerException
    public static void NullPointerException() {
        String text = null; 

        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null; 

        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!!");
        } finally {
            System.out.println("End of exception handling.");
        }
    }
    public static void main(String[] args) {
        // Call method to generate the exception
        System.out.println("NullPointerException without handling:");
        NullPointerException();

        // calling method to handle the exception
        System.out.println("\nHandling NullPointerException:");
        handleNullPointerException();
    }

   

    
}
