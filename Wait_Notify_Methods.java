public class Wait_Notify_Methods {
    public static void main(String[] args) {
        Message message = new Message("Hello, World!");

        Thread senderThread = new Thread(new Sender(message));
        Thread receiverThread1 = new Thread(new Receiver(message));
        Thread receiverThread2 = new Thread(new Receiver(message));

        senderThread.start();
        receiverThread1.start();
        receiverThread2.start();
    }
}

class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

class Sender implements Runnable {
    private Message message;

    public Sender(Message message) {
        this.message = message;
    }

    public void run() {
        String[] messages = {"Message 1", "Message 2", "Message 3", "Message 4"};

        for (String msg : messages) {
            message.setMessage(msg);
            synchronized (message) {
                message.notify();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Receiver implements Runnable {
    private Message message;

    public Receiver(Message message) {
        this.message = message;
    }

    public void run() {
        synchronized (message) {
            try {
                message.wait();
                System.out.println(Thread.currentThread().getName() + " received message: " + message.getMessage());
                message.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
