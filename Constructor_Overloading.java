class A {
    A() {
        System.out.println("Default Constructor");
    }

    A(int a) {
        System.out.println("Parameterized Constructor");
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {

        // Creating objects of class A
        // Passing different arguments
        // This will call the corresponding constructor
        A obj1 = new A();
        A obj2 = new A(10);
    }
}
