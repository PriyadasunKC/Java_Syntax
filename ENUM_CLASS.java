enum Laptop {
    MacBook (1200),Dell(800),HP(),Lenovo(1000),Asus(1500),MSI(1300);

    private int price;

    private Laptop () {
        price = 340;
    }

    private Laptop (int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class ENUM_CLASS {
    public static void main(String[] args) {
        
        // print all the enum values

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + "\t: " + lap.getPrice());
        }
    }
}