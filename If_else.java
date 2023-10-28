public class If_else {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        if (a == b) {
            System.out.println(a + " is equal to " + b);
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is not equal to b");
        }

        // Ternary operator
        System.out.println(a == b ? "a is equal to "
                : a > b ? "a is greater than b" 
                : a < b ? "a is less than b" 
                : "a is not equal to b"
        );
    }
}
