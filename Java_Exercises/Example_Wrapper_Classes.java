import java.util.Scanner;

class Example_Wrapper_Classes {
    public static void main(String[] args) {

        // Create Objects using Wrapper classes

        String FirstName = new String();
        String LastName = new String();
        String FullName = new String();
        // Auto boxing
        Double Weight = 0.0;
        Double Height = 0.0;
        Double BMI = 0.0;

        try (// Create a objects of Scanner class
                Scanner input = new Scanner(System.in)) {
            // Get user inputs
            System.out.print("Enter First Name \t: ");
            FirstName = input.nextLine();
            System.out.print("Enter Last Name \t: ");
            LastName = input.nextLine();
            System.out.print("Enter Weight in Kg \t : ");
            Weight = input.nextDouble();
            System.out.print("Enter Height in m \t : ");
            Height = input.nextDouble();
        }

        // Accept return values from methods
        FullName = getFullName(FirstName, LastName);
        BMI = getBMI(Weight, Height);

        // Print the full name
        System.out.println("Full Name : " + FullName);

        // Print the BMI
        System.out.println("BMI \t: " + String.format("%.4f", BMI) + "Kg/m x m");
    }

    // Method to Generate Full Name
    static String getFullName(String fName, String lName) {
        return fName.concat(" " + lName);
    }

    // Method to Generate get BMI
    static double getBMI(double W, double H) {
        return (W / (H * H));
    }
}