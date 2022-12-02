package JavaEnum;

// Java Enum Example: Defined inside class
public class EnumApp {
    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        // The Java compiler internally adds the values() method when it creates an enum
        // The values() method returns an array containing all the values of the enum
        for (Season s : Season.values())
            System.out.println(s);

        // The Java compiler internally adds the valueOf() method when it creates an enum
        // The valueOf() method returns the value of given constant enum
        System.out.println("Value of WINTER is: " + Season.valueOf("WINTER"));

        // The Java compiler internally adds the ordinal() method when it creates an enum
        // The ordinal() method returns the index of the enum value
        System.out.println("Index of WINTER is: " + Season.valueOf("WINTER").ordinal());
        System.out.println("Index of SUMMER is: " + Season.valueOf("SUMMER").ordinal());
    }
}
/*
Enum improves type safety
Enum can be easily used in switch
Enum can be traversed
Enum can have fields, constructors and methods
Enum may implement many interfaces but cannot extend any class because it internally extends Enum class
Enum can not be local
*/

