import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile_Using_PrintWriter {
    public static void main(String[] args) {
        PrintWriter pr = null;
        try {
            pr = new PrintWriter("Sample_Text_for_Reading.txt");
            pr.println("Hello World");
            pr.println("New things going to happen in hogwarts, Death eaters are back to power");
            pr.println("Harry potter is the only one who can save the world");
            pr.println(100);
            pr.println(100.00);
            pr.println('A');
        }catch (IOException e ) {
            System.out.println(e);
        }finally {
            if(pr != null) {
                try {
                    pr.close();
                }catch (Exception e) {
                    System.out.println(e);
                }    
            }
        }
        System.out.println("Success...");
    }
}
