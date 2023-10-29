class A {
    void show1(){
        System.out.println("In A");
    }
}

class B extends A{
    void show2(){
        System.out.println("In B");
    }
}

public class Upcasing_and_Downcasing_of_Objects {
    public static void main(String[] args) {
        
        // Upcasing
        A a_obj = (A) new B();
        // This is similar to
        // A obj = new B();

        // Accessing the method of class A using obj of class B
        a_obj.show1();

        // Downcasing
        B b_obj = (B) a_obj;

        // Accessing the method of class B using obj of class B
        b_obj.show2();
    }
}
