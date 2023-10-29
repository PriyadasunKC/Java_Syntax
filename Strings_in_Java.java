public class Strings_in_Java {
    public static void main(String[] args) {
        
        // String is a class in Java
        // We can crete a object of String class and assign a value to that object
        String name = new String("John");
        // this is same as,
        // String name = "John";


        System.out.println(name);

        // Get the hash-code of the string object
        System.out.println(name.hashCode());

        // Concatenate strings with + operator
        System.out.println("Hello " + name);

        // Check the character of particular index of the string
        System.out.println(name.charAt(0));

        // Concatenate 2 strings with concat() method
        System.out.println(name.concat(" Hello"));

        // Check the length of the string
        System.out.println("Length of the String " + name.length());

        // Check 2 strings are equal or not
        System.out.println("Is John = John : " + name.equals("John"));

        // use substring() method to get a part of the string
        System.out.println(name.substring(0));

        // use substring() method to get a part of the string
        System.out.println(name.substring(0, 2));

        // use toLowerCase() method to convert the string to lower case
        System.out.println(name.toLowerCase());

        // use toUpperCase() method to convert the string to upper case
        System.out.println(name.toUpperCase());

        // use trim() method to remove the white spaces from the string
        System.out.println(name.trim());

        // use replace() method to replace a character or a string with another character or string
        System.out.println(name.replace("J", "KI"));
        
    }
}