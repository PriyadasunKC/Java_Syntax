import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception_With_Read_Entire_File {
    public static void main(String[] args) {

        BufferedReader bufferReader = null;
        try {
            FileReader fileReader = new FileReader("./Sample_Text_for_Reading.txt");
            bufferReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);
            }
        }   catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        } catch (Exception e) {
            System.out.println("Other Exception" + e);
        } finally {
            try {
                if (bufferReader != null) {
                    bufferReader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file");
            }

            System.out.println("Rest of the code");
        }
    }
}