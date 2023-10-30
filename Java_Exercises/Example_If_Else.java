import java.util.Scanner;

public class Example_If_Else {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for X \t: ");
        double X = input.nextDouble();

        System.out.print("Enter value for Y \t: ");
        double Y = input.nextDouble();

        System.out.println("X = " + X + " Y = " + Y);

        checkPositive(X, Y);
        checkDifferenceIsPositive(X, Y);
        checkInRange(Y);
        checkNumberOfDigits(Y);
        checkBothOdd(X, Y);

    }

    static void checkPositive (double n1, double n2) {
        if (n1 > 0 && n2 > 0) {
            System.out.println("X and Y are Positive Numbers");
        }else {
            System.out.println("X and Y are not positive numbers");
        }
    }

    static void checkDifferenceIsPositive (double n1, double n2) {
        if ( (n1 - n2) > 0) {
            System.out.println("X - Y are Positive Numbers");
        }else {
            System.out.println("X - Y are not positive numbers");
        }
    }

    static void checkInRange (double n1) {
        if ( n1 >= 20 && n1 <=50) {
            System.out.println("Y is  in range 20 - 50");
        }else {
            System.out.println("Y is not in range 20 - 50");
        }
    }

    static void checkNumberOfDigits (double n1) {
        // convert the number to positive
        int number = Math.abs( (int) n1);

        if (number == 0) {
            System.out.println("Number pf digits in " + n1 + " \t: 1");
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number pf digits in " + n1 + " : " + count);
    }

    static void checkBothOdd (double n1, double n2) {
        if ( ((n1 % 2) != 0) && ((n2 % 2) != 0)) {
            System.out.println("Both X and Y values are not odd numbers");
        }else {
            System.out.println("Both X and Y values are not odd numbers");
        }
    }

}
