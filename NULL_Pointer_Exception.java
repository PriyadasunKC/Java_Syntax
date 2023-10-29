public class NULL_Pointer_Exception {
    public static void main(String[] args) {
        
        String str = null;
        // This line throws NullPointerException
        // because str is null
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }
        System.out.println("Rest of the code...");
    }
}
