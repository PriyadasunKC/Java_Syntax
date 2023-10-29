enum Status {
    RUNNING, PENDING, FAILED, COMPLETED;
}

public class ENUMS_With_IF_ELSE {
    public static void main(String[] args) {
        
        Status s = Status.FAILED;

        if (s == Status.RUNNING) {
            System.out.println("Application is running");
        }else if (s == Status.PENDING) {
            System.out.println("Application is pending");

        }else if (s == Status.FAILED) {
            System.out.println("Application is failed");
        }else {
            System.out.println("Application is completed");
        }
    }
}