public class Violate_Keyword {
    private volatile boolean flag = false;

    public static void main(String[] args) {
        Violate_Keyword example = new Violate_Keyword();

        Thread writerThread = new Thread(() -> {
            System.out.println("Writer Thread is setting the flag to true.");
            example.setFlagTrue();
        });

        Thread readerThread = new Thread(() -> {
            while (!example.isFlag()) {
                // Busy-wait until the flag becomes true
            }
            System.out.println("Reader Thread detected the flag as true.");
        });

        writerThread.start();
        readerThread.start();
    }

    public void setFlagTrue() {
        flag = true;
    }

    public boolean isFlag() {
        return flag;
    }
}
