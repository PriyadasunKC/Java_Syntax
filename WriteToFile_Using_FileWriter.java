import java.io.FileWriter;

public class WriteToFile_Using_FileWriter {
    public static void main(String[] args) {
         FileWriter wr = null;
       try {
            wr =  new FileWriter("Sample_Text_for_Reading.txt");
            wr.write("This is write by file writer class");
       }catch (Exception e) {
            System.out.println(e);
       }finally {
            if(wr != null) {
                try {
                    wr.close();
                }catch (Exception e) {
                    System.out.println(e);
                }
            }
       }
       
       System.out.println("Success...");
    }
}