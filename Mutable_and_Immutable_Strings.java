
public class Mutable_and_Immutable_Strings {
    public static void main(String[] args) {
        
        // String is immutable
        // This creates the string "John" and stores it in the String Pool
        // The variable name will refer to the object in the String Pool 
        String name = "John";
        System.out.println(name);


        // This creates the string "John" and stores it in the String Pool
        // The variable name will refer to the object in the String Pool
        // This will create only one object in the String Pool
        // The variable names will refer to the same object in the String Pool
        String obj1 = "john";
        String obj2 = "john";
        System.out.println(obj1 == obj2); // true
    }
}
