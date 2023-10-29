import java.util.Scanner;

public class Get_User_Keyboard_Inputs {
    public static void main(String[] args) {
        
        // Create object of Scanner class
        Scanner s_obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s_obj.nextInt();
        s_obj.close();
        System.out.println("You entered: " + number);
    }
}
