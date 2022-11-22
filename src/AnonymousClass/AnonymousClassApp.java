package AnonymousClass;

public class AnonymousClassApp {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        // if the goal of extending class (here, "B"), is to only override/implement show method
        // Anonymous class can be used
        // This results in same as above 2 lines, but here we don't need to create class "B"
        A obj1 = new A() {
            @Override
            void show() {
                System.out.println("I am the best!");
            }
        };

        obj1.show();
    }
}

abstract class A {
    abstract void show();
}

class B extends A {
    @Override
    public void show() {
        System.out.println("I am the best!");
    }
}
