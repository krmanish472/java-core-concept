package DataAbstraction.Interfaces.StaticMethodInInterface;

public class StaticMethodApp {
    public static void main(String[] args) {
        Demo.staticShow();
    }
}

interface Demo {
    int num = 20;

    void abc();

    default void show() {
        System.out.println("Hi!");
    }

    static void staticShow() {
        System.out.println("Hi! from static show");
    }
}
