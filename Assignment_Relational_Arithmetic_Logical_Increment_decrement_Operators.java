public class Assignment_Relational_Arithmetic_Logical_Increment_decrement_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        boolean x = false;

        // Assignment operators
        System.out.println("a = 10");
        c = a;
        System.out.println("c = a: " + c);
        c += a;
        System.out.println("c += a: " + c);
        c -= a;
        System.out.println("c -= a: " + c);
        c *= a;
        System.out.println("c *= a: " + c);
        c /= a;
        System.out.println("c /= a: " + c);
        c %= a;
        System.out.println("c %= a: " + c);


        // Relational operators
        System.out.println("a = 10, b = 20");
        x = (a == b);
        System.out.println("(a == b): " + x);
        x = (a != b);
        System.out.println("(a != b): " + x);
        x = (a > b);
        System.out.println("(a > b): " + x);
        x = (a < b);
        System.out.println("(a < b): " + x);
        x = (a >= b);
        System.out.println("(a >= b): " + x);
        x = (a <= b);
        System.out.println("(a <= b): " + x);
        

        // arithmetic operators
        c = a + b;
        System.out.println("a + b: " + c);
        c = a - b;
        System.out.println("a - b: " + c);
        c = a * b;
        System.out.println("a * b: " + c);
        c = a / b;
        System.out.println("a / b: " + c);
        c = a % b;
        System.out.println("a % b: " + c);


        // Logical operators
        // Logical AND
        x = (a != b) && (a < b);
        System.out.println("(a != b) && (a < b): " + x);

        // Logical OR
        x = (a == b) || (a < b);
        System.out.println("(a == b) || (a < b): " + x);

        // Logical NOT
        x = !(a == b);
        System.out.println("!(a == b): " + x);


        // Increment and Decrement operators
        System.out.println("a = 10");
        
        // pre-increment
        ++a;
        System.out.println("++a: " + a);

        // post-increment
        a++;
        System.out.println("a++: " + a);

        // pre-decrement
        --a;
        System.out.println("--a: " + a);

        // post-decrement
        a--;
        System.out.println("a--: " + a);
        
    }
}
