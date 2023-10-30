public class Example_Primitive_Data_Types_Main_Method{
    public static void main(String[] args) {
        
        // Declare and initialize variables with default values
        double fahrenheit = 212;
        double celsius = 98.5;
        double result = 0;

        // Convert Fahrenheit to Celsius
        result = ((fahrenheit - 31) * 5/9);
        System.out.println("Fahrenheit Value Before Converting to Celsius \t: " + String.format("%.2f",fahrenheit));
        System.out.println("Fahrenheit Value After Converting to Celsius \t: " + String.format("%.2f", result));

        // Convert Celsius to Fahrenheit
        result = ((celsius * 9/5) + 32);
        System.out.println("Celsius Value Before Converting to Fahrenheit \t: "+ String.format("%.2f",celsius));
        System.out.println("Celsius Value After Converting to Fahrenheit \t: "+ String.format("%.2f", result));
    }
}