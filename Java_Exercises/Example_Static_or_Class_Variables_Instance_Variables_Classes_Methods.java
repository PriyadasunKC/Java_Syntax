class StaticDemo {
    
    // declare instance variable
    int num1;

    // Declare Static Variable
    // Can access by class name
    static int num2;
    public StaticDemo (int n1,int n2) {
        this.num1 = n1;

        // Static variables/ methods can access using static way / class name
        StaticDemo.num2 = n2;
    }
}

public class Example_Static_or_Class_Variables_Instance_Variables_Classes_Methods {
    public static void main(String[] args) {
        // Create objects of StaticDemo class
        StaticDemo s1 = new StaticDemo(15,17 );
        System.out.println("In s1 object1 : num1 \t: " + s1.num1 + "\tnum2 : \t "+ StaticDemo.num2);

        StaticDemo s2 = new StaticDemo(22,28);
        System.out.println("In s2 object1 : num1 \t: " + s2.num1 + "\tnum2 : \t "+ StaticDemo.num2);
    }   
}
