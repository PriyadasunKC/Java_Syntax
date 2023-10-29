interface A {
    void display ();
    void config ();
}

interface C {
    void show ();
}

//  interface D inherits fromm interface C
interface D extends C {

}

// Here we can use A,C / A,D because interface C is inherited by interface D

class B implements A,D { // Multiple inheritance supported in interfaces

    // need to implement all the methods of interface A and C
    public void display () {
        System.out.println("Display B from interface A");
    }

    public void config () {
        System.out.println("Config B from interface A");
    }

    public void show () {
        System.out.println("Show B from interface C");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        
        // Cannot create object of interface
        // A obj = new A();

        // But we can create reference of interface
        A a_obj = new B ();

        // Now we can call methods of interface
        a_obj.display();
        a_obj.config();


        // We cannot access methods of interface C by using reference of interface A
        // a_obj.show();

        // But we can create reference of interface C
        C c_obj = new B ();

        // Now we can call methods of interface C
        c_obj.show();
        
    }
}