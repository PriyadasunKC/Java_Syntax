public class DaemonThread_Non_DaemonThreads {
    public static void main(String[] args) {
        Thread nonDaemonThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Non-Daemon Thread: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread daemonThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Daemon Thread: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Set the daemon flag for the daemonThread
        daemonThread.setDaemon(true);

        // Start both threads
        nonDaemonThread.start();
        daemonThread.start();

        // The JVM will exit when all non-daemon threads have finished.
    }
}
