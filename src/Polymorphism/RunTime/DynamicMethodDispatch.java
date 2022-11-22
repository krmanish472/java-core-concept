package Polymorphism.RunTime;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Human human = new Man(); // run time polymorphism
        // only those available in human can be called
        human.show();
        // human.eat() => error as human has no knowledge of eat

        human = new Woman(); // dynamic method dispatch
        human.show();

    }
}

class Human {
    void show() {
        System.out.println("in Human show");
    }
}

class Man extends Human {
    @Override
    void show() {
        System.out.println("in Man show");
    }

    void eat() {
        System.out.println("in Man eat");
    }
}

class Woman extends Human {
    @Override
    void show() {
        System.out.println("in Women show");
    }

    void eat() {
        System.out.println("in Woman eat");
    }
}
