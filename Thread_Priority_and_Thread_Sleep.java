class Thread1 extends Thread {
    public void run () {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                // Thread is goes to sleeping when this execute to 10 milliseconds
                // Sleep Method throws an InterruptedException
                // So, We need to catch it.
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread {
    public void run () {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");

            
            try {
                // Thread is goes to sleeping when this execute to 10 milliseconds
                // Sleep Method throws an InterruptedException
                // So, We need to catch it.
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Thread_Priority_and_Thread_Sleep {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();

        // Get the priority of our custom threads
        System.out.println("Thread1 priority : " + th1.getPriority());
        System.out.println("Thread2 priority : " + th2.getPriority());


        // Set the priority to our custom threads by giving value
        th1.setPriority(1);

        // Set the priority using Thread class constants
        th2.setPriority(Thread.MAX_PRIORITY);

        th1.start();
        th2.start();
    }
}
