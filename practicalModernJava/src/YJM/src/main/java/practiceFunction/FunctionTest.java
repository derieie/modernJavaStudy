package YJM.src.main.java.practiceFunction;

import java.util.function.Function;

public class FunctionTest {

    public static void testMain() {
        Function<String, Integer> parseIntFunction = (String str) -> Integer.parseInt(str) +1;
        Function<Integer, String> intToStrFuntion = (Integer i) -> "String : " + Integer.toString(i);

        System.out.println(parseIntFunction.apply("1000"));
        System.out.println(intToStrFuntion.apply(1000));
        System.out.println(parseIntFunction.andThen(intToStrFuntion).apply("1000"));
        System.out.println(intToStrFuntion.compose(parseIntFunction).apply("1000"));
    }
    
}
