public class Try_with_Multiple_Catch_Blocks {
    public static void main(String[] args) {
        int i = 2;
        int result = 0;
        int arr[] = new int[5];

        try {
            result = 10 / i;
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide by Zero ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds");
        }
        catch(Exception e){
            System.out.println("Some thing went wrong");
        }
        System.out.println("Rest of the code...");
    }
}
