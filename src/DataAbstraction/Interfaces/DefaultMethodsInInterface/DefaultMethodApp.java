package DataAbstraction.Interfaces.DefaultMethodsInInterface;

public class DefaultMethodApp {
    public static void main(String[] args) {
        Demo demo = new DempImpl();
        demo.show();
        demo.abc();
    }
}

@FunctionalInterface
interface Demo {
    void abc();

    default void show() {
        System.out.println("in Interface show");
    }
}

class DempImpl implements Demo {

    @Override
    public void abc() {
        System.out.println("in abc");
    }

    @Override
    public void show() {
        System.out.println("in Impl show");
    }
}
