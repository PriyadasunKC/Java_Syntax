import java.io.IOException;

class A {
    // parent method not throwing any exception
    public void show() throws IOException{
        System.out.println("In A");
    }
}

class B extends A {
    @Override
    // child parent method throwing checked exception
    // child method can throw same exception or its child exception
    // exception can be changed to unchecked exception
    public void show() throws IOException {
        System.out.println("In B");
    }
}

public class Exceptions_with_Overriding {
    public static void main(String[] args) {
        B b_obj = new B();
        b_obj.show();
    }
}
