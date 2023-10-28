public class Switch_Statement {
    public static void main(String[] args) {
        
        int n = 2;

        switch (n) {
            case 1:
            {
                System.out.println("One");
                break;
            }
            case 2:
            {
                System.out.println("Two");
                break;
            }
            default:
            {
                System.out.println("Not Found");
                break;
            }
        }

        // Minimal Switch code 
        switch (n) {
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            default: System.out.println("Not Found"); break;
        }
    }    
}
