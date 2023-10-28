public class Value_Parse_ValueOf {
    public static void main(String[] args) {
        
        // Type case using parse()
        // String to int
        System.out.println("Parse() method");
        String number = "150";
        int num = Integer.parseInt(number);
        System.out.println(num);

        // String to double
        number = "134.56";
        double num2 = Double.parseDouble(number);
        System.out.println(num2);

        // Type cast using valueOf()
        // String to int
        System.out.println("ValueOf() method");
        number = "150";
        num = Integer.valueOf(number);
        System.out.println(num);

        // String to double
        number = "134.56";
        num2 = Double.valueOf(number);
        System.out.println(num2);

        // Value() method
        System.out.println("Value() method");
        Integer intObj = Integer.valueOf("150");
        int num3 = intObj.intValue();
        System.out.println(num3);

    }
}
