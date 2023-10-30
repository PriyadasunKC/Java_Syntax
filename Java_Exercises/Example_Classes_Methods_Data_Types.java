// Create a class called Triangle
class Triangle {
    
    // Declare Instance variables
    private double height;
    private double base;
    private double hypotenuse;

    // Using 
    public Triangle (double H , double B) {
        this.height = H;
        this.base = B;
    }

    // define the methods
    // Return the value
    public double FindArea() {
        return (0.5 * height * base);
    }

    public double FindHypotenuse () {
        hypotenuse = (Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2)));      
        return hypotenuse;
    }

    public double FindPerimeter () {
        return (height + base + hypotenuse);
    }
}

public class Example_Classes_Methods_Data_Types {
    public static void main(String[] args) {
        
        // Create local variables to accept the return values
        double area = 0;
        double hypotenuse = 0;
        double perimeter = 0;

        // Create objects of Triangle class
        Triangle t_obj = new Triangle(4,3);

        // Using the object accessing the methods of Triangle class
        // Return values are accept using created variables
        area = t_obj.FindArea();
        hypotenuse = t_obj.FindHypotenuse();
        perimeter = t_obj.FindPerimeter();

        // print the result
        System.out.println("Base \t: 3.0"+ "\nHeight \t: 4.0 \n" + "Area \t : " + area +"\n" + "Hypotenuse \t: "+ hypotenuse+ "\n" + "Perimeter \t: "+perimeter);
    }
}
