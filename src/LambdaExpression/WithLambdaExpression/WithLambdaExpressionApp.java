package LambdaExpression.WithLambdaExpression;

import LambdaExpression.Printable;

public class WithLambdaExpressionApp {
    public static String printThing(Printable thing) {
        return thing.print("!");
    }

    public static void main(String[] args) {

        // using anonymous class
/*        String str = printThing(
                new Printable() {
                    @Override
                    public String print(String suffix) {
                        return "Meow" + suffix;
                    }
                }
        );*/

        // Same as above, but using lambda expression
        String str = printThing((suffix) -> "Meow" + suffix);

        // same as above, but expanded
/*      Printable lambdaPrintable = (suffix) -> "Meow" + suffix;
        String str = printThing(lambdaPrintable);
*/
        System.out.println(str);
    }
}

/*
 * Lambda Expression
 * It can only be used in context of Functional Interfaces
 * If Interface has more than 1 abstract method, Lambda cannot be used
 * */
