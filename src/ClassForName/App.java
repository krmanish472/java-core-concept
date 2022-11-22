package ClassForName;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName("ClassForName.Demo");

    }
}

class Demo {
    static {
        System.out.println("in static");
    }

    {
        System.out.println("in instance");
    }
}
