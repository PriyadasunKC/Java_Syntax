class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public void display_Cal () {
        System.out.println("This is a calculator Class");
    }
}

class AdvancedCalculator extends Calculator {

    // Method Overriding
    @Override
    public int add (int a , int b) {
        return a + b + 10;
    }

    public void display_AdCal () {
        System.out.println("This is a AdvancedCalculator Class");
    }
}

public class Polymorphism_Method_Overriding {
    public static void main(String[] args) {

        // creating object of child class (AdvancedCalculator)
        AdvancedCalculator ad_obj = new AdvancedCalculator();

        // Call the override method
        int result = ad_obj.add(2, 3);
        System.out.println(result);

        // Call the parent method
        ad_obj.display_Cal();

        // Call the child (own) method
        ad_obj.display_AdCal();
        
    }
}
