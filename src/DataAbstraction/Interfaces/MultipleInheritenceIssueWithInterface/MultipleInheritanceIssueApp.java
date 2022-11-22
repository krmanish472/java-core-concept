package DataAbstraction.Interfaces.MultipleInheritenceIssueWithInterface;

public class MultipleInheritanceIssueApp {
    public static void main(String[] args) {
        Demo demo = new Impl();
        demo.show();
    }
}

interface Demo {
    default void show() {
        System.out.println("in Demo show");
    }
}

interface MyDemo {
    default void show() {
        System.out.println("in MyDemo show");
    }
}

class Impl implements Demo, MyDemo {

    // Ambiguity for which show to call if no override here!
    // hence we need to implement it
    @Override
    public void show() {
//        System.out.println("in Impl show");
        Demo.super.show();
    }
}
