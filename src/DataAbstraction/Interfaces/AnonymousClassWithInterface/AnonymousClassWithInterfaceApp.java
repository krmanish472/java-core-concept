package DataAbstraction.Interfaces.AnonymousClassWithInterface;

public class AnonymousClassWithInterfaceApp {
    public static void main(String[] args) {
        Abc abc = new Abc() {
            @Override
            public void show() {
                System.out.println("Hello Boy!");
            }

            @Override
            public void display() {
                System.out.println("Hello Girls!");
            }
        };

        abc.show();
        abc.display();
    }
}

interface Abc {
    void show();

    void display();
}

/*
 * There is no need to create a class whose purpose is just to override interface methods
 * Instead we can just use anonymous class as above
 * */