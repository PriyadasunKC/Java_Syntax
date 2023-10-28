// Abstract Class
abstract class A {

    // Abstract Method
    public abstract void show();
}

public class Abstract_Classes_and_Anonymous_Inner_Class {
    public static void main(String[] args) {
        
        // Create an object of A  by using Anonymous Inner Class 
        A a_obj = new A () {

            @Override
            public void show () {
                System.out.println("In Abstract_Classes_and_Anonymous_Inner_Class");
            }
        };

        a_obj.show();
    }
}
