package LambdaExpression;

@FunctionalInterface
public interface Printable {

    String print(String suffix);

    default void printHello() {
        System.out.println("Hello");
    }

    default void printWorld() {
        System.out.println("World");
    }
}
