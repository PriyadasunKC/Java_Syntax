class A <G> {
    public void display(G x) {
        G y = (G) x;
        System.out.println(y);
    }
}

public class Generics {
    public static void main(String[] args) {
        
        A <String> obj = new A <> ();
        obj.display("Hello");

        A <Integer> obj2 = new A <> ();
        obj2.display(10);


    }
}
