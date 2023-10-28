public class Ex2_Copy_Arrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = new int [5];

        // Copying array using for loop
        for (int i = 0; i < arr1.length; i++) {
            arr2 [i] = arr1 [i];
        }

        // Printing the copied array
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
