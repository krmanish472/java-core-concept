package LambdaExpression.WithoutLambdaExpression;

import LambdaExpression.Printable;

public class WithoutLambdaExpressionApp {
    public static String printThing(Printable thing) {
        return thing.print("!");
    }

    public static void main(String[] args) {
        String str = printThing(new Cat());
        System.out.println(str);
    }
}


class Cat implements Printable {
    @Override
    public String print(String suffix) {
        return "Meow" + suffix;
    }
}
