package DataAbstraction.AbstractClasses.Applied;

public class AppliedApp {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.show(10);
        printer.show(10.5);
    }
}

class Printer {

/*    public void show (Integer num){
        System.out.println(num);
    }

    public void show (Double num){
        System.out.println(num);
    }*/

    // Above 2 methods can be replaced with below
    // as Number abstract class is extended by Integer as well as Double
    public void show(Number num) {
        System.out.println(num);
    }
}
