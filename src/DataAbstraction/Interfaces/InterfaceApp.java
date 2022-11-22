package DataAbstraction.Interfaces;

public class InterfaceApp {
    public static void main(String[] args) {
        Kit kit = new Kit();

        // Writer writer = new Pen();
        Writer writer = new Pencil();

        kit.doSomething(writer);
    }
}

class SomeClass {

}

interface Writer {
    // it is known that the variable is final and static and public
    int id = 10;

    // it is known that the method is abstract and public
    void write();

    // default method
    default void hello() {

    }
}

class Pen extends SomeClass implements Writer {
    public void write() {
        System.out.println("I am Pen");
    }
}

class Pencil implements Writer {
    public void write() {
        System.out.println("I am Pencil");
    }
}

class Kit {
    public void doSomething(Writer writer) {
        writer.write();
    }
}


/*
 * Interfaces specify what a class must do and not how. It is the blueprint of the class
 * Multiple inheritance is not supported in Java
 * Interface will help in implementing Multiple Inheritance
 * We can not create object of Interface we can only have its reference
 * If a class implements an interface and does not provide method bodies for all functions specified in the interface,
 * then the class must be declared abstract
 * Interface can lately have abstract methods as well as default methods
 * */

/*
 * Why do we use an Interface?
 * It is used to achieve total abstraction.
 * Since java does not support multiple inheritances in the case of class, by using an interface it can achieve multiple inheritances.
 * It is also used to achieve loose coupling.
 * Interfaces are used to implement abstraction. So the question arises why use interfaces when we have abstract classes?
 * * The reason is, abstract classes may contain non-final variables, whereas variables in the interface are final, public and static
 * */