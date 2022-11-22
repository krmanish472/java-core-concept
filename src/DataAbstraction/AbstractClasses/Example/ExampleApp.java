package DataAbstraction.AbstractClasses.Example;

public class ExampleApp {
    public static void main(String[] args) {
        Kit kit = new Kit();

        // Writer writer = new Pen();
        Writer writer = new Pencil();

        kit.doSomething(writer);
    }
}

abstract class Writer {
    abstract void write();
}

class Pen extends Writer {
    public void write() {
        System.out.println("I am Pen");
    }
}

class Pencil extends Writer {
    public void write() {
        System.out.println("I am Pencil");
    }
}

class Kit {
    public void doSomething(Writer writer) {
        writer.write();
    }
}