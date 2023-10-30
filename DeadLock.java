public class DeadLock {
    public static void main(String[] args) {
        // Create two resources
        Object resource1 = new Object();
        Object resource2 = new Object();

        // Thread 1 tries to lock resource1 then resource2
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for resource2...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource2");
                }
            }
        });

        // Thread 2 tries to lock resource2 then resource1
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for resource1...");
                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
