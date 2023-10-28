// import the File1_Package1 class from package1 to Packages.java file
import package1.File1_Package1;

// Java inbuilt packages for arrayList
import java.util.ArrayList;


public class Packages {
    public static void main(String[] args) {
        
        int result = 0;

        // crate an object of File1_Package1 class
        File1_Package1 obj = new File1_Package1();
        result = obj.add(10, 20);
        System.out.println("10 + 20 = " + result);

        result = obj.subtract(10, 20);
        System.out.println("10 - 20 = " + result);

        // Use arrayList to demonstrate the java inbuilt packages called java.util
        ArrayList <Integer> nArray = new ArrayList  <Integer> ();
        nArray.add(10);
        System.out.println(nArray);
    }
}
