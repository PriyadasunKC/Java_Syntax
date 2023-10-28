public class For_Loop {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            System.out.println(i);
        }

        String name = "Chathura";
        for (char c : name.toCharArray()) {
            System.out.println(c);
        }
    }
}
