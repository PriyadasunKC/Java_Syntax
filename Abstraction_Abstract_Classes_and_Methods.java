// Abstract class can have abstract and non-abstract methods
abstract class Car {
    
    // abstract method
    // abstract method does not have a body
    // abstract method must be overridden in the child
    public abstract void drive();
    
    // non-abstract method
    public void playMusic () {
        System.out.println("Playing music");
    }
}

// Concrete class
// Class that not a abstract class is called concrete class
class Benz extends Car {
    // overriding abstract method
    @Override
    public void drive () {
        System.out.println("Driving Benz");
    }
}

public class Abstraction_Abstract_Classes_and_Methods {
    public static void main(String[] args) {

        // Cannot create object of abstract class
        // Car car = new Car();

        //Can Create object of child class
        Benz b_obj = new  Benz();
        // Access non-abstract method
        b_obj.playMusic();
        // Access abstract method
        b_obj.drive();


        // Can create reference of abstract class
        Car c_obj = new Benz();
        // Access non-abstract method
        c_obj.playMusic();
        // Access abstract method
        c_obj.drive();

    }
}
