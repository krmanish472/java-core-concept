package Keywords.StaticKeyword;

public class StaticWithMethod {
    static int a = 10;
    int b = 20;

    void m1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println("from m2");
    }

    // static method
    static void m2() {
        a = 20;
        System.out.println("from m1");

        // b = 10; // compilation error => Non-static field 'b' cannot be referenced from a static context

        // m1();  // compilation error => Non-static method 'm1()' cannot be referenced from a static context

        // System.out.println(super.a); // compiler error => cannot use super in a static context
    }


    public static void main(String[] args) {

    }
}

/*
 * Note:
 * static method will only access static field
 * non static method can access static as well as not static field
 * Methods declared as static have several restrictions:
 * They can only directly call other static methods.
 * They can only directly access static data.
 * They cannot refer to this or super in any way.
 * static method can be overloaded
 * static method can not be overridden
 * */