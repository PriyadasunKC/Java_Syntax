public class Example_Type_Casting {
    public static void main(String[] args) {
        int X = 5;
        double Y = 10.5;
        
        // Convert X value into double
        // Widening Casting
        double R = X;

        // Convert X value into long
        // Widening Casting
        long S = X;

        // Convert Long into Float
        // Widening Casting
        float T = X;

        // Convert Y value into int
        // Narrowing Casting
        int U = (int)  Y;

        // Convert Y value into long
        // Narrowing Casing
        long V = (long) Y;

        System.out.println("X : "+X + "\t" +"Y : "+ Y + "\t"+ "\n" + R+ "\n"+S + "\n"+ T+ "\n"+ U+ "\n"+ V+ "\n");
    }    
}
