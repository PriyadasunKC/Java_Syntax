class A {
    
    int name = 10;
    public void show () {
        System.out.println("In Outer Class A Show");
    }

    static class B {
        public void Config () {
            System.out.println("In Inner Class B Config");
        }
    }

}


public class Inner_Classes {
    private static final String A = null;

    public static void main(String[] args) {
     
        // Create object of class A
        A a_obj = new A ();
        // Call show method of class A
        a_obj.show();


        // Create object of class B
        // If Inner class is Static one
        // then we can not create object of it
        A.B b_obj = new A.B ();

        // Call Config method of class B
        b_obj.Config();
    }
}
