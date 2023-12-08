import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile_Using_FileWriter_Avoiding_Replacing_Existing_Content {
    public static void main(String[] args) {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("Sample_Text_for_Reading.txt", true);
            pw = new PrintWriter(fw);
            pw.println("\nHello World");
            pw.println("Hogwarts are in great danger");
            pw.append("Harry Potter is the only one who can save them");
            pw.flush();
        }catch (IOException e) {
            System.out.println(e);
        }finally {
            try {
                fw.close();
            }catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("Success...");
    }
}
