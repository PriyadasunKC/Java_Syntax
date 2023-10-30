public class Short_Form_with_Lambda_Expression_Thread_Creation_with_Runnable_Functional_Interface {
    public static void main(String[] args) {

        // Create Runnable object using Lambda expression
        // Since Runnables are functional interfaces we can short the code using lambda expression
        Runnable th1 = () -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
        };
        Runnable th2 = () -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
        };

        // Create objects of Thread class and pass the objects of the threads we created
        // Because the Runnable interface has not start() method
        Thread t_obj1 = new Thread(th1);
        Thread t_obj2 = new Thread(th2);

        // Using thread objects we can call the start methods.
        t_obj1.start();
        t_obj2.start();
    }
}
