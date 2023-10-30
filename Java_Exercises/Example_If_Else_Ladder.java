import java.util.Scanner;

public class Example_If_Else_Ladder {
    public static void main(String[] args) {
        
        char grade;

        // Create Scanner class object to get inputs
        Scanner input = new Scanner (System.in);

        // get user input
        System.out.print("Enter Marks \t: ");
        int marks = input.nextInt();

        // Call the gradeGenerator method by passing arguments
        grade = gradeGenerator(marks);

        if (grade == 'F') {
            System.out.println("Subject Fail");
        }else {
            System.out.println("Grade for subject \t: " + grade);
        }
    }

    static char gradeGenerator (int marks) {
        
        // Check the grade
        if (marks >= 75) {
            return 'A';
        } else if (marks < 75 && marks >= 65){
            return 'B';
        } else if (marks < 65 && marks >= 55){
            return 'C';
        }else {
            return 'F';
        }
    }
}
