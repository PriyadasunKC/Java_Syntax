// Create a class called Triangle

import java.util.InputMismatchException;
import java.util.Scanner;

class Triangle {

    // Create new instance Variables
    private int A;
    private int B;
    private int C;

    // Create a constructor to accept values
    public Triangle(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    // Create a method triangleChecker
    public boolean triangleChecker() {
        // Check Valid Triangle or not
        if (((A + B) > C) && ((B + C) > A) && ((C + A) > B)) {
            return true;
        } else {
            return false;
        }
    }

    // Create a method getPerimeter
    public int getPerimeter() {
        return (A + B + C);
    }

}

public class Example_User_Inputs_Classes_Methods {
    public static void main(String[] args) {

        // try block automatically close the input resource
        try (// Create a object of scanner class
            Scanner input = new Scanner(System.in)) {
            System.out.println("Enter length of 3 sides");
            System.out.print("Side 1 \t: ");
            int side1 = input.nextInt();
            System.out.print("Side 1 \t: ");
            int side2 = input.nextInt();
            System.out.print("Side 1 \t: ");
            int side3 = input.nextInt();

            // Create a object of Triangle Class
            Triangle tr_obj = new Triangle(side1, side2, side3);

            if (tr_obj.triangleChecker()) {
                System.out.println("Perimeter \t: " + tr_obj.getPerimeter());
            } else {
                System.out.println("Invalid Triangle Lengths!");
            }
        }catch (InputMismatchException e) {
            System.out.println(e);
        }

    }
}
