class count {

    int count;
    // Can access by only one thread at a time
    // This is done by synchronized keyword
    public synchronized void Increment() {
        count++;
    }
}

public class Race_Condition_of_Threads {
    public static void main(String[] args) {

        count c_Count = new count();

        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                c_Count.Increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 10; i++) {
                c_Count.Increment();
            }
        };

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();

        // Join() is use to wait for thread complete its execution
        // before the execution of next thread
        // Join method throws InterruptedException
        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Count: " + c_Count.count);
    }
}
