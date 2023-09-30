package PYJ;

import java.util.Objects;
import java.util.function.Function;

public class FunctionExample {
    public static int excuteFunction(String context, Function<String, Integer> function){
        return function.apply(context);
    }

    public static void main(String[] args){
        Object length = FunctionExample.excuteFunction("Hello!!!", (String context) -> context.length());
        System.out.println("result =>"+ length);

        //블로그예제
        Function<Integer, String> functionAdd =
                (num) -> Integer.toString(num + 100);

        Function<Integer, String> functionMinus =
                (num) -> Integer.toString(num - 100);

        Function<Integer, String> functionMultiple =
                (num) -> Integer.toString(num * 100);

        System.out.println("50 + 100 = " + functionAdd.apply(50));
        System.out.println("50 - 100 = " + functionMinus.apply(50));
        System.out.println("50 * 100 = " + functionMultiple.apply(50));
    }
}
