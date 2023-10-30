// Swapping 2 numbers with 3rd variable and without 3rd variable

// Create a swap class
class Swap {
    // Create variables
    private int number1;
    private int number2;
    private int temp;

    public Swap(int num1, int num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    // method to swap variables with third variable
    public void swapWithThirdVariable() {
        //print the values before swap
        System.out.println("Values Before Swap X \t: " + number1 + "\tY \t: "+ number2);
        
        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Values After Swap X \t: " + number1 + "\tY \t: "+ number2);
    }

    // method to swap without third variable
    public void swapWithoutThirdVariable() {
    //print the values before swap
    System.out.println("Values Before Swap X \t: " + number2 + "\tY \t: "+ number1);
    
    number1 = number1 + number2;
    number1 = number1 - number2;

    System.out.println("Values After Swap X \t: " + number1 + "\t Y \t: "+ number2);
    }
}

public class Example_Methods_Classes_Data_Types {
    public static void main(String[] args) {
        // Create a object of Swap Class
        Swap s_obSwap = new Swap(15, 5);
        
        // Access the methods using created object
        s_obSwap.swapWithThirdVariable();
        s_obSwap.swapWithoutThirdVariable();
    }
}
