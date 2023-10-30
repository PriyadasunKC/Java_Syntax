
// Create Thread 1
// Thread1 class extends form parent Thread class
class Thread1 extends Thread{
    // Every custom thread need run method
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}

class Thread2 extends Thread{
    public void run () {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }   
}

public class Thread_Creation_and_Start_Thread {
    public static void main(String[] args) {
        
        // Create object from custom threads
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();

        th1.start();
        th2.start();
    }
}