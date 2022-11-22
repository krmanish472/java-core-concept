package Keywords.StaticKeyword;

public class StaticWithVariable {
    // static block
    static {
        System.out.println("Inside static block 1");
    }

    // static variable
    static int a = m1();

    // static block
    static {
        System.out.println("Inside static block 2");
    }

    // static method
    static int m1() {
        System.out.println("from m1");
        return 20;
    }

    // static method(main !!)
    public static void main(String[] args) {
        System.out.println("Value of a : " + a);
        System.out.println("from main");
    }
}

/*
* Output:
Inside static block 1
from m1
Inside static block 2
Value of a : 20
from main
* */

/*
 * When a variable is declared as static,
 * then a single copy of the variable is created and shared among all objects at the class level.
 * Static variables are, essentially, global variables. All instances of the class share the same static variable.
 * We can create static variables at the class level only.
 * static block and static variables are executed in the order they are present in a program (see output for this program)
 * */
