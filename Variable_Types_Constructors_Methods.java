
class dog {
    // instance variables
    // Not need to initialize the instance variables 
    // Every time when we create a new object, instance variables will be created;
    String name;
    int age;


    // Static variables
    // Static variables should be initialized before use
    // Static variables are common for all objects
    static String color = "Black";


    // constructor
    // constructor name should be same as class name
    // constructor should not have any return type
    dog(){
        System.out.println("Dog object is created");
    }

    public void bark () {
        
        // local variables
        // local variables should be initialized before use
        String sound = "Barking";
        int legs = 4;

        System.out.println ("Dog sound is : "+ sound + "\nDog have : "+ legs + " legs");
    }

}


public class Variable_Types_Constructors_Methods {
    public static void main(String[] args) {
        
        // creating dog object
        // This will call the constructor of dog class
        dog dog_obj = new dog();


        // Assign instance public default variable in dog class
        dog_obj.name = "Gimmy";
        dog_obj.age = 10;

        // call the bark method
        dog_obj.bark();

        // Access the static variable
        // Can access static variables by using class name 
        System.out.println ("Dog Color is "+ dog.color);

    }
}
