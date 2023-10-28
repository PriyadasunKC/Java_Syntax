public class Widening_Narrowing_type_casting {
    public static void main (String [] args) {
        double n1 = 1.23;
        float n2 = (float) 23.232;
        long n3 = 123;
        int n4 = 2;
        short n5 = 2;
        byte n6 = 2;

        // Widening Casting
        // byte --> short
        short n7 = n6;

        // short --> int
        int n8 = n5;

        // int --> long
        long n9 = n4;

        // long -> float
        float n10 = n2;

        // float --> double
        double n11 = n2;


        // Narrowing Casting
        // double --> float
        float n12 = (float) n1;

        // float --> long
        long n13 =  (long) n2;

        // long --> int
        int n14 = (int) n3;

        // int --> short
        short n15 = (short) n4;

        // short --> byte
        byte n16 = (byte) n5;


        // 1 byte --> 2bytes --> 4bytes --> 8bytes --> 4bytes --> 8bytes 
        // byte --> short --> int --> long --> float --> double

    }
}

 