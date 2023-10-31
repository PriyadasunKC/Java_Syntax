package pkgA;

import java.util.Scanner;

public class Example_Calculator {
    private double average;
    private int range;
    private int arr[] = new int[5];
    private int value = 0;
    private int count = 0;
    private int sum = 0;
    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;

    public void getUserInputs() {
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter Value \t: ");
                value = input.nextInt();
                arr[i] = value;
                count++;
                sum += value;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        range = max - min;
        average = (double) sum / count;
    }

    public void display() {
        System.out.println("Average : " + average);
        System.out.println("Range : " + range);
    }
}
