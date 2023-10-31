public class Example_CompileTime_Polymorphism_Method_Overloading {
    public static void main(String[] args) {
        
        double ar1 = Area(5, 4);
        double ar2 = Area(5, 4, 7);

        System.out.println("Area by Area of triangle formula : " + ar1);
        System.out.println("Area by Another formulr formula : " + (double)ar2);

    }

    static double Area (double v1, double v2) {
        return (0.5 * v1 * v2);
    }

    static double Area(double v1, double v2, double v3) {
        double s = ((v1 + v2 + v3) / 2);
        return Math.sqrt(s * (s - v1) * (s - v2) * (s - v3));
    }
}
