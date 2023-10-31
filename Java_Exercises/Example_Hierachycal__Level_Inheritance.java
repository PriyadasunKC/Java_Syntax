class PC {
    public void typeOfPC()  {
        System.out.println("There are 2 types pf PC na,es as  Desktops and Laptops");
    }
}

class Desktops extends PC{
    public void typesOFDesktops() {
        System.out.println("Desktops are 2 main categories");
    }
}

class Laptops extends PC{
    public void TypesOfLaptops() {
        System.out.println("Mac , ASUS ,MSI");
    }
}

public class Example_Hierachycal__Level_Inheritance {
    public static void main(String[] args) {
        Desktops deck = new Desktops();
        deck.typeOfPC();
        deck.typesOFDesktops(); 

        Laptops lap = new Laptops();
        lap.typeOfPC();
        lap.TypesOfLaptops();

    }
}
