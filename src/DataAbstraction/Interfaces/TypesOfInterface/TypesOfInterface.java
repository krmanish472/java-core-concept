package DataAbstraction.Interfaces.TypesOfInterface;

public class TypesOfInterface {
    public static void main(String[] args) {

    }
}

// Functional Interface
@FunctionalInterface
interface Alpha {
    // SAM
    void display();

    // default method
    default void show() {

    }

    default void print() {

    }
}


// Marker Interface
interface Beta {

}

class Test implements Beta {

}


/*
 * 3 Types:
 * 1. Normal
 * 2. Functional/SAM -Single Abstract Method
 * 3. Marker
 * */

/*
 * Functional Interface:
 * Functional Interface should have one and only one abstract method
 * It can have default methods, even multiple
 * */

/*
 * Marker Interface:
 * Marker Interface does not have any method
 * */

/*
 * Normal Interface:
 * All other interfaces are Normal Interfaces
 * */