class dog {
    String name;
    int age;

    public void bark () {
       System.out.println("Name :" + name + "\nAge : "+ age); 
    }
}

public class Array_of_Objects_of_Class {
    public static void main(String[] args) {

        // Creating an array of objects of class dog
        dog [] dog_obj_arr = new dog[2];

        // Initializing the array of objects of class dog
        dog_obj_arr[0] = new dog();
        dog_obj_arr[1] = new dog();

        // Initializing the objects of class dog
        dog_obj_arr[0].name = "Tommy";
        dog_obj_arr[0].age = 5;

        dog_obj_arr[1].name = "Bruno";
        dog_obj_arr[1].age = 10;

        // Calling the method bark() on the objects of class dog
        for (int i = 0; i < dog_obj_arr.length; i++) {
            dog_obj_arr[i].bark();
        }
    }
}
