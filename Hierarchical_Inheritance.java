class A {
    public void display_A() {
        System.out.println("This is from class A");
    }
}

class B extends A {
    public void display_B() {
        System.out.println("This is from class B");
    }
}


class C extends A {
    public void display_C() {
        System.out.println("This is from class C");
    }
}


public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        
        // Create object of class B
        B b_obj = new B();
        
        // Accessing methods of class A
        b_obj.display_A();
        // Accessing own methods
        b_obj.display_B();



        // Create object of class C
        C c_obj = new C();

        // Accessing methods of class A
        c_obj.display_A();

        // Accessing own methods
        c_obj.display_C();
    }
}

// Multiple inheritance is not supported in Java.
// Java supports multiple inheritance through interfaces only.
