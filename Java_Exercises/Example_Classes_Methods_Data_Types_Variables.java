// Create class named calculator
class Calculator {
    
    // declare variables
    private int number1;
    private int number2;

    // Create constructor to get the values to number1 and number2

    public Calculator (int n1, int n2) {
        this.number1 = n1;
        this.number2 = n2;
    }

    // Create methods of calculator calss

    // Addition Method
    public int Addition () {
        return number1 + number2;
    }

    // Subtraction Method
    public int Subtraction () {
        return number1 - number2;
    }

    // Multiplication Method
    public int Multiplication () {
        return number1 * number2;
    }

    // Division Method
    public double Division () {
        return (number1 / number2);
    }

    // Modulus Method
    public int Modulus () {
        return number1 % number2;
    }

}

public class Example_Classes_Methods_Data_Types_Variables {
    public static void main(String[] args) {
        
        // Create local variables
        int add = 0;
        int sub = 0;
        int mul = 0;
        double div = 0;
        int mod = 0;

        // Create object of Calculator Class
        Calculator c_obj = new Calculator(12, 5);

        // Return the calculations by accessing Calculator class using its object
        add = c_obj.Addition();
        sub = c_obj.Subtraction();
        mul = c_obj.Multiplication();
        div = c_obj.Division();
        mod = c_obj.Modulus();

        // Print the results
        System.out.println("number 1 \t: 12 \tnumber 2 \t: 5 \nAddition \t: " + add+ "\nSubtraction \t: " + sub +"\nMultiplication \t: " + mul+"\nDivision \t: " + div+"\nModulus \t: " + mod);
    }
}
