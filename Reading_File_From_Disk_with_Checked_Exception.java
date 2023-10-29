import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading_File_From_Disk_with_Checked_Exception {
    public static void main(String[] args) {
        
        try {
            // Create FileReader object to read the file
            FileReader fr_obj = new FileReader("./Sample_Text_for_Reading.txt");

            // Create object of BufferedReader to read the file line by line
            BufferedReader br_obj = new BufferedReader(fr_obj);

            // Read the first line from the file
            System.out.println(br_obj.readLine());

            // Close the BufferedReader object
            br_obj.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("IO Exception");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Rest of the code");
    }
}
