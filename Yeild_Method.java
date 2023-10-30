public class Yeild_Method {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                // Yield method pauses the execution of currently running thread and gives the chance to the threads of same priority.
                Thread.yield(); // Hint to the scheduler to yield the CPU
            }
        };

        Thread thread1 = new Thread(runnable, "Thread 1");
        Thread thread2 = new Thread(runnable, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
