enum Status {
    RUNNING, PENDING, FAILED, COMPLETED;
}

public class ENUMS_With_Switch {
    public static void main(String[] args) {
        
        Status s = Status.FAILED;
        
        switch (s) {
            case RUNNING:
                System.out.println("Application is running");
                break;
            case PENDING:
                System.out.println("Application is pending");
                break;
            case FAILED:
                System.out.println("Application is failed");
                break;
            case COMPLETED:
                System.out.println("Application is completed");
                break;
            default:
                System.out.println("Application is completed");
                break;
        }
    }
}