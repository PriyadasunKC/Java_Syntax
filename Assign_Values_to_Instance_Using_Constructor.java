class Person {

    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display () {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    } 

}

public class Assign_Values_to_Instance_Using_Constructor {
    public static void main(String[] args) {
        
        // Create object of class Person 
        // When we create object of class Person, we are calling the constructor of class Person

        Person person_obj = new Person("John", 25);
        person_obj.display();

    }
}
