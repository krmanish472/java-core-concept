package Keywords.FinalKeyword;

public class FinalWithMethod {
    public static void main(String[] args) {

    }
}

class Human {
    final void display() {
        System.out.println("in parent display");
    }
}

class Person extends Human {
    // final method can not be overridden
/*    @Override
    void display() {
        System.out.println("in child display");
    }*/
}
