public class Example_Data_Types_Methods {
    public static void main(String[] args) {
        
        // Declare Variables and Assign Values
        int X = 10;
        int Y = 5; 
        int Z = 15;
        double average = 0;

        // Call the Average method by passing X,Y,Z values
        // Accept the return value to average variable
        average = Average(X, Y, Z);

        // Print the result
        System.out.println("The average of 10 , 5, 15 is : " + String.format("%.2f", average));
    }

    // Create Average Method to Find the Average of the passing numbers from the main method
    // We accept passed values using X,Y,Z int variable
    // The Average should be double value, So, return type of the Average method is double
    public static double Average (int X, int Y, int Z) {
        // Return the Average
        return (X + Y + Z)/3;
    }
}
