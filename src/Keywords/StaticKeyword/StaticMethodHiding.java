package Keywords.StaticKeyword;

public class StaticMethodHiding {
    public static void main(String[] args) {
        Alpha obj1 = new Beta();
        // As per overriding rules this should call derived class's display()
        // Since static method can not be overridden, it calls base class's display()
        obj1.display();

        // Here overriding works and derived class's print() is called
        obj1.print();
    }
}

class Alpha {

    // Static method in base class which will be hidden in subclass
    public static void display() {
        System.out.println("Static or class method from Base");
    }

    public void print() {
        System.out.println("Non-static or Instance method from Base");
    }
}

class Beta extends Alpha {

    // This method is hidden by display() in Base
    public static void display() {
        System.out.println("Static or class method from Derived");
    }

    @Override
    public void print() {
        System.out.println("Non-static or Instance method from Derived");
    }

    // overloading the methods inherited from the superclass
    // such overloaded methods neither hide nor override the superclass methods
    // they are new methods, unique to the subclass
    public void print(String name) {
        System.out.println("Non-static or Instance method from Derived");
    }
}

/*
 * For instance (or non-static) methods,
 * method is called according to the type of "object" being referred,
 * not according to the type of reference,
 * which means method calls is decided at run time.
 * */

/*
 * For class (or static) methods,
 * method according to the type of "reference" is called,
 * not according to the object being referred,
 * which means method call is decided at compile time
 * */

/*
 *  A static method cannot hide an instance method
 *  An instance method cannot override a static method,
 * */