class Calculator {
    public int add (int a, int b) {
        return a + b;
    }
}

class AdvancedCalculator extends Calculator {
    
    @Override
    public int add (int a, int b) {
        return a + b + 10;
    }
}

public class Polymorphism_Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        // Creating object of Child class referencing by Parent class
        Calculator ad_cal_obj = new AdvancedCalculator();

        // calling override method
        int result = ad_cal_obj.add(3, 4);
        System.out.println("3 + 4 + 10 = " + result);

    }
}
