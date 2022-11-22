package Keywords.StaticKeyword;

public class StaticWithBlock {
    static int a = 10;
    static int b;

    // created as soon as class is created
    static {
        System.out.println("static block initialized");
        b = a * 4;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.name);

        A a2 = new A();
        System.out.println(a2.name);
    }
}

class A {
    String name;

    // create each time object is created
    {
        System.out.println("instance block initialized");
        name = "Manish";
    }
}

/*
* used for memory management.
* used to share the same variable or method of a given class to all object.
* The static keyword belongs to the class than an instance of the class.
* The static keyword is used for a constant variable or a method that is the same for every instance of a class.
* The static keyword is a non-access modifier in Java that is applicable for the following:
    Blocks
    Variables
    Methods
    Classes
* */

/*
If you need to do the computation in order to initialize your static variables,
you can declare a static block that gets executed exactly once, when the class is first loaded
* */
