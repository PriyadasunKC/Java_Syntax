public class Throw_Keywords_in_Exception_Handling {
    public static void main(String[] args) {
        
        int i = 20;
        int result = 0;

        try {
            result = 18/i;
            if (result == 0) {
                throw new ArithmeticException("Cannot put result as zero");
            }
        }    
        catch (ArithmeticException e) {
            System.out.println("This is default Value " + e);
        }
    }
}
