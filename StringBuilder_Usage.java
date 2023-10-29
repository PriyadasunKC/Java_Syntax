public class StringBuilder_Usage {
    public static void main(String[] args) {
        
        // Create object of StringBuilder class
        StringBuilder sb = new StringBuilder("John Hello");
        System.out.println(sb);

        // Append string to StringBuilder
        sb.append(" This is newly added");
        System.out.println(sb);

        sb.append(" Update").replace(0, 0, "Earth ");
        System.out.println(sb);
    }
}