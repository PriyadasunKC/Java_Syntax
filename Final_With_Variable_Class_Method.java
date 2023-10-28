final class A {
     public final void show () {
       System.out.println("A class"); 
    }
}

/* 
 class B extends A { // Error: cannot inherit from final A
    // public void show () { // Error: show() in B cannot override show() in A
    //     System.out.println("B class");
    // }
}
*/


public class Final_With_Variable_Class_Method {
    public static void main(String[] args) {
        
        final int NUM = 10;
        // NUM = 20; // Error: cannot assign a value to final variable NUM


    }
}
