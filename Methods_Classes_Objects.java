    
    // dog class
    class dog  {
        String name;
        int age;

        // bard method
        void bark () {
            System.out.println("Dog is barking");
        }
    }


public class Methods_Classes_Objects {
    public static void main(String[] args) {
        
        // creating dog object

        // assign instance public default variable in dog class 
        dog dog_obj = new dog();
        dog_obj.name = "Gimmy";
        dog_obj.age = 10;

        // accessing the dog class instance variables
        System.out.println("Dog name is  : "+ dog_obj.name + "\nDog age is : "+ dog_obj.age );
       
        // call the bark method of dog class
        dog_obj.bark();

    }
}
