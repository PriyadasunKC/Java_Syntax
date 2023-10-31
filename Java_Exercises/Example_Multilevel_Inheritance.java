class PC {
    public void typeOfPC()  {
        System.out.println("There are 2 types pf PC na,es as  Desktops and Laptops");
    }
}

class Laptops extends PC{
    public void TypesOfLaptops() {
        System.out.println("Mac , ASUS ,MSI");
    }
}

class Tablet extends Laptops{
    public void TypesOfTablets() {
        System.out.println("Convertible / Hybrid");
    }
}

public class Example_Multilevel_Inheritance {
    public static void main(String[] args) {
    
        Laptops lap = new Laptops();
        lap.typeOfPC();
        lap.TypesOfLaptops();

        Tablet tab = new Tablet();
        tab.typeOfPC();
        tab.TypesOfLaptops();
        tab.TypesOfTablets();

    }
}
