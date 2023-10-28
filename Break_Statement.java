public class Break_Statement {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10 ; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}