class A {
    public void show () {
        System.out.println("A show");
    }
}

// Create a thread that using Runnable Functional Interface
// To that we need to implement that Runnable interface
// Runnable interface has run method.
class Thread1 extends A implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Thread2 implements Runnable {
    public void run () {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}



public class Thread_Creation_with_Runnable_Functional_Interface {
    public static void main(String[] args) {
        
        // Create object by custom threads
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();

        // Create objects of Thread class and pass the objects of the threads we created
        // Because the Runnable interface has not start() method
        Thread t_obj1 = new Thread(th1);
        Thread t_obj2 = new Thread(th2);

        // Using thread objects we can call the start methods.
        t_obj1.start();
        t_obj2.start();
        th1.show();
    }
}
