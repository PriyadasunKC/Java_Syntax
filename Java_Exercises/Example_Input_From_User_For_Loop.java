import java.util.Scanner;

public class Example_Input_From_User_For_Loop {
    public static void main(String[] args) {
        

        int [] add = new int [5];
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible int value
        int min = Integer.MAX_VALUE; // Initialize min to the largest possible int value

        try (Scanner input = new Scanner (System.in)) {
            int value = 0;
            for (int i = 0 ; i < add.length ; i++) {
                System.out.print("Enter Value \t : ");
                value = input.nextInt();
                add[i] = value;
            }
        }
        for (int i = 0 ; i < add.length ; i++) {

            if (max < add[i]) {
                max = add[i];
            }

            if (min > add[i]) {
                min = add [i];
            }
        }
        
        System.out.println("Max value : " + max);
        System.out.println("Min value : " + min);
    
    }


}
