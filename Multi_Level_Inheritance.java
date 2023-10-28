class calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

class advanced_calculator extends calculator{
    public int mul(int a, int b){
        return a*b;
    }
    public double div(int a, int b){
        return a/b;
    }
}

class very_advanced_calculator extends advanced_calculator{
    public double pow(int a, int b){
        return Math.pow(a, b);
    }
}


public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        

        very_advanced_calculator v_obj = new very_advanced_calculator();
        System.out.println("a = 5, b = 4");
        int r1 = v_obj.add(5, 4);
        int r2 = v_obj.sub(5, 4);
        int r3 = v_obj.mul(5, 4);
        double r4 = v_obj.div(5, 4);
        double r5 = v_obj.pow(5, 4);

        System.out.println("a + b = " + r1);
        System.out.println("a - b = " + r2);
        System.out.println("a * b = " + r3);
        System.out.println("a / b = " + r4);
        System.out.println("a ^ b = " + r5);

    }
}
