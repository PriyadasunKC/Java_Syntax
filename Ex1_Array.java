public class Ex1_Array {
    public static void main(String[] args) {
        
        int[] arr1 = {4,10,25};
        int[] arr2 = {15,11,4,19,25};

        // print elements unique to arr1
        for (int i = 0; i < arr1.length ;i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length;j++) {
                
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(arr1[i]);
            }
        }

        // print elements unique to arr2
        for (int i = 0; i < arr2.length ;i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length;j++) {
                
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(arr2[i]);
            }
        }
    }
}
