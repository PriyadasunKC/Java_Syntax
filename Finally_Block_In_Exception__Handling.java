public class Finally_Block_In_Exception__Handling {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("Rest of the code...");        
    }
}
