// create a class that extends Exception class
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Throw_Own_Exceptions {
    public static void main(String[] args) {
        
        int i = 20;
        int result = 0;

        try {
            result = 18 / i;
            if (result == 0) {
                throw new MyException("Result is cannot be zero");
            }
        }
        catch (MyException e) {
            System.out.println("This is Default Value: " + e);
        }
        
        System.out.println("Rest of the code");
    }
}
