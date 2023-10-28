public class Labels {
    public static void main(String[] args) {
        
        label:
        for (int i = 0; i <= 3 ; i++) {
            for (int j = 0 ; j <= 3 ; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Going to break the outer loop");
                    break label;
                }
                System.out.println("i = "+ i +" j = " + j );
            }
        }

    }
}
