

class A extends Object{
    public A () {
        super();
        System.out.println("In A Default Constructor");
    }
    public A (int i) {
        System.out.println("In A Parametrized Constructor");
    }

    public void show () {
        System.out.println("In A Show");
    }
}

class B extends A {
    public B () {

        // By default super() is called even we not write it
        System.out.println("In B Default Constructor");
    }
    public B (int i) {
        this();
        System.out.println("In B Parametrized Constructor");
    }
}

public class Super_And_This_Methods {
    public static void main(String[] args) {
        B b_obj = new B (5);
    }
}
