class Account {
    private long acc_no;
    private String name;
    private String email;
    private String id;
    private double amount;

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

}

public class Example_Encapsulation {
    public static void main(String[] args) {

        long acc_no = 12232132122L;
        String name = "Nimal Js";
        String id = "111133221433";
        String email = "sd@gmial.com";
        double amount = 25000;

        Account ac = new Account();
        ac.setAcc_no(acc_no);
        ac.setName(name);
        ac.setId(id);
        ac.setEmail(email);
        ac.setAmount(amount);

        System.out.println("Account Number \t\t \t: " + acc_no);
        System.out.println("Name of account holder t\t: " + name);
        System.out.println("ID of thee account holder \t: " + id);
        System.out.println("E-mail of the account holder \t: " + email);
        System.out.println("Total amount deposited \t\t: " + amount);

        if ((ac.getAcc_no()) == 0) {
            System.out.println("Invalid Account Number");
        } else {
            System.out.println("Valid Account NUmber");
        }

    }
}
