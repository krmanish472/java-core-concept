package Keywords.SuperKeyword;

public class SuperWithMethods {
    public static void main(String args[]) {
        Student s = new Student();
        s.display();
    }
}

class Person {
    void message() {
        System.out.println("This is person class\n");
    }

    private void doSomethingPrivate() {
        System.out.println("doSomethingPrivate");
    }
}

class Student extends Person {
    @Override
    void message() {
        System.out.println("This is student class");
    }

    void display() {
        message(); // This is student class
        super.message(); // This is person class
        // super.doSomethingPrivate(); => private, so not applicable
    }

}

/*
 * super keyword:
 * can only be used inside a class to refer to that class's parent class
 * can not be used to access private methods or fields in the class
 * */