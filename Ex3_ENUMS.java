enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class Ex3_ENUMS {
    public static void main(String[] args) {
        
        // Print the all the values of enum
        days [] Days = days.values();

        for (days d : Days) {
            System.out.println(d);
        }
    }
}