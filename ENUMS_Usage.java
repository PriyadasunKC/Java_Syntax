enum direction {
    EAST, WEST, NORTH, SOUTH
}

public class ENUMS_Usage {
    public static void main(String[] args) {
        
        // Creating an object of enum
        direction direct = direction.EAST;
        System.out.println(direct);

        // print the index of enum object
        System.out.println(direct.ordinal());

        // Get the all the values of enum using values() method.
        // this method returns an array of enum type
        direction [] Dir = direction.values();

        // Print the all values of enum
        for (direction d : Dir) {
            System.out.println(d + "\t : " + d.ordinal());
        }

        // Compare two enum objects using == operator
        if (direct == direction.EAST) {
            System.out.println("Both are equal using == operator");
        }

        // Compare two enum objects using equals() method
        if (direct.equals(direction.EAST)) {
            System.out.println("Both are equal using equals() method");
        }

    }
}