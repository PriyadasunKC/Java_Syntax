import java.lang.StringBuffer;

public class StringBuffer_Usage {
    public static void main(String[] args) {
        
        // Create object of StringBuffer class
        StringBuffer sb = new StringBuffer("John Hello");
        System.out.println(sb);

        // Append string to StringBuffer
        sb.append(" This is newly added");
        System.out.println(sb);

        // Insert string to StringBuffer
        sb.insert(5, "Inserted ");
        System.out.println(sb);

        // Delete string from StringBuffer
        sb.delete(14, 19);
        System.out.println(sb);

        // Delete single character from StringBuffer
        sb.deleteCharAt(5);
        System.out.println(sb);

    }    
}
