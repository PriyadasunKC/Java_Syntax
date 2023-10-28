class dog {

    // Creating instance method
    public void bark () {
        System.out.println("Dog is barking");
    }

    // Creating static method
    public static void eat () {
        System.out.println("Dog is eating");    
    }
}

public class Instance_and_Static_Methods {
    public static void main(String[] args) {
        
    // to call instance methods we need to create an object of the class
    dog d1 = new dog();
    
    // calling instance method uing object
    d1.bark();

    // calling static method using class name
    dog.eat();

    }
}
