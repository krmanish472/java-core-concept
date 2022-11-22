package Keywords.FinalKeyword;

public class FinalWithClass {
    public static void main(String[] args) {

    }
}

// final class can not be overridden
final class Animal {
    public void show() {
        System.out.println("in Animal show");
    }
}

// error: can not inherit from final class
/*
class Dog extends Animal {

}
*/
