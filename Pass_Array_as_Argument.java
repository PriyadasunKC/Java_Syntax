
class dog  {
    public void bark(String [] arr) {
         for (int i = 0; i < arr.length; i++) {
             System.out.println("Name : " + arr[i]);
         }
    }
}

public class Pass_Array_as_Argument {
    public static void main(String[] args) {
        
        String [] arr = {"Gimmy", "Tommy", "Bruno"};
        dog obj = new dog();

        // Passing an array as an argument to a method
        obj.bark(arr);

    }
}
