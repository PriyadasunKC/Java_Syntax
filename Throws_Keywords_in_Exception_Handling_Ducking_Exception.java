class A {
    public void show () throws ClassNotFoundException{
        // in here we not handling the exception
        // so we are ducking the exception
        Class.forName("Cal");
    }
}

public class Throws_Keywords_in_Exception_Handling_Ducking_Exception {
    public static void main(String[] args) {
        A a_obj = new A();

        try {
            a_obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}