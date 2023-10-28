class A {
    public void show() {
        System.out.println("In A");
    }
}

public class Anonyms_Inner_Class {
    public static void main(String[] args) {
        
        // Anonyms_Inner_Class
        A a_obj = new A () {
            @Override
            public void show () {
                System.out.println("In Anonyms_Inner_Class");
            }
        };

        a_obj.show();
    }   
}
