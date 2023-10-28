class Person {

    private String name;
    private int age;

    // Setters
    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    // Getters

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        
        // Create an instance of person class
        Person p_obj = new Person();

        // Set values to the instance
        p_obj.setName("Chathura");
        p_obj.setAge(25);

        // Get values from the instance
        String name = p_obj.getName();
        int age = p_obj.getAge();

        // Print the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
