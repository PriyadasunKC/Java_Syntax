public class Arrays {
    public static void main(String[] args) {
        
        // Integer Array
        int[] numbers = new int[3];
        int[] numbers3 = {10, 20, 30};

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // Print the array
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        // String Array
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Doe";
        names[2] = "Smith";
        
        // Print the array
        for (String i : names) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Multi-dimensional Array - 2D
        int[][] numbers2 = new int[2][2];
        numbers2[0][0] = 10;
        numbers2[0][1] = 20;
        numbers2[1][0] = 30;
        numbers2[1][1] = 40;

        // Print the array
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                System.out.print (numbers2[i][j]  + " ");
            }
        }
        System.out.println();





    }
}
