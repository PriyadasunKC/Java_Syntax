public class Wait_NortifyAll {
    public static void main(String[] args) {
        Message message = new Message("Hello, World!");

        Thread senderThread = new Thread(new Sender(message));
        Thread receiverThread1 = new Thread(new Receiver(message, "Receiver 1"));
        Thread receiverThread2 = new Thread(new Receiver(message, "Receiver 2"));

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
                message.notifyAll(); // Notify all waiting threads
            }
            try {
                Thread.sleep(1000); // Sleep to simulate message sending delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Receiver implements Runnable {
    private Message message;
    private String name;

    public Receiver(Message message, String name) {
        this.message = message;
        this.name = name;
    }

    public void run() {
        synchronized (message) {
            try {
                message.wait(); // Wait for a notification
                System.out.println(name + " received message: " + message.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
