package Keywords.StaticKeyword;

public class StaticMethodOverloading {
    public static void foo() {
        System.out.println("Test.foo() called ");
    }

    public static void foo(int a) {
        System.out.println("Test.foo(int) called ");
    }

    // Compiler Error: cannot redefine foo()
/*    public void foo() {
        System.out.println("Test.foo(int) called ");
    }*/

    public static void main(String args[]) {
        StaticMethodOverloading.foo();
        StaticMethodOverloading.foo(10);
    }
}