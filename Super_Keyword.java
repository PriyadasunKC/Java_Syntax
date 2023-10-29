class A {
    String color = "Red";

    void printColor() {
        System.out.println(color);
    }
}

class B extends A {
    String color = "Blue";

    void printColor() {
        System.out.println(color);
        super.printColor();
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        
        B b_obj = new B();
        b_obj.printColor();
    }
}
