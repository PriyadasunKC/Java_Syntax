public class Exception_Handling_Try_Catch_Block {
    public static void main(String[] args) {
        int i = 0;
        int result = 0;
        try {
            result = 10/i;
        }catch (Exception e) {
            System.out.println("Some Exception Occurs");
        }
        System.out.println("Rest of the Code");
    }
}
