package DataAbstraction.Interfaces.LambdaExpressionWithInterface;

public class LambdaExpressionWithInterfaceApp {
    public static void main(String[] args) {

        Human human = new Human() {
            @Override
            public void work() {
                System.out.println("Working!!");
            }
        };

        human.work();

        // same as above
        Human human1 = () -> System.out.println("Working!!");
        human1.work();
    }
}

@FunctionalInterface
interface Human {
    void work();
}

/*
 * Lambda Expression will work with only Functional Interface
 * */