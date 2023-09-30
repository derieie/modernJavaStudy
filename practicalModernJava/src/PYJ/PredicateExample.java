package PYJ;

import java.util.function.Predicate;

public class PredicateExample {
    public static boolean isValid(String name, Predicate<String> predicate){
        return predicate.test(name);
    }

    public static void main(String[] args){
        boolean type = PredicateExample.isValid("", (String name) -> !name.isEmpty());
        System.out.println("result -> " +type);

        Predicate<Integer> predicate = (num) -> num < 10;
        System.out.println((predicate.test(5)));
    }
}
