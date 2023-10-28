public class Jagged_Arrays {
    public static void main(String[] args) {
        
        int numbers [][] = new int [3][];
        // numbers[0] = new int[3];
        // numbers[1] = new int[2];
        // numbers[2] = new int[1];
        numbers[0] = new int[]{1,2,3};
        numbers[1] = new int[]{1,2};
        numbers[2] = new int[]{1};


        for (int i = 0 ; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
