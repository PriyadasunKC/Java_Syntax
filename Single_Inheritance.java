class Animal {

    public String name;

    public void eat() {
        System.out.println("Animal name is : "+ name);
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barking...");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        
        // Child Element can access Parent variables and methods
        Dog d_obj = new Dog();
        d_obj.name = "Bull Dog";
        d_obj.eat();
        d_obj.bark();


        // Parent Element can't access Child Element
        // Parent element can access only its own element
        Animal a_obj = new Animal();
        a_obj.name = "Lion";
        a_obj.eat();
    }
}
