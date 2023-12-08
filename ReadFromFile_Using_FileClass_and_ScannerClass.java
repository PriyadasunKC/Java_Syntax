import java.util.Scanner;
import java.io.File;

public class ReadFromFile_Using_FileClass_and_ScannerClass {
    public static void main(String[] args) {
        try {
            File fl = new File("Sample_Text_for_Reading.txt");
            Scanner sc = new Scanner(fl);

            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                System.out.println(s);
            }
            sc.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
