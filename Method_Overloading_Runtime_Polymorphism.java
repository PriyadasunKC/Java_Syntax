class Calculator {
    public int add (int n1 , int n2) {
        return n1 + n2;
    }

    public int add (int n1 , int n2 , int n3) {
        return  n1 + n2 + n3;
    }

    public double add (double n1 , int n2) {
        return n1 + n2;
    }    
}

public class Method_Overloading_Runtime_Polymorphism {
    public static void main(String[] args) {
        

        // Method Overloading

        // create object of Calculator class
        Calculator c_obj = new Calculator();

        // Passing 2 parameters
        int r1 = c_obj.add(1, 2);

        // Passing 3 parameters
        int r2 = c_obj.add(1, 2, 3);

        // Passing 2 parameters (double and int)
        double r3 = c_obj.add(1.5, 2);

        System.out.println("1 + 2 = " + r1);
        System.out.println("1 + 2 + 3 = " + r2);
        System.out.println("1.5 + 2 = " + r3);
    }
}
