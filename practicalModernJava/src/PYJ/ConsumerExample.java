package PYJ;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void excuteConsumer(List<String> nameList, Consumer<String> consumer){
        for(String name : nameList){
            consumer.accept(name); //
        }
    }

    public static void main(String[] args){
        List<String> nameList = new ArrayList<>();
        nameList.add("바보");
        nameList.add("멍충이");
        nameList.add("아아");
        nameList.add("케이크");
        ConsumerExample.excuteConsumer(nameList, (String name) -> System.out.println(name));

        //블로그에제
        Consumer<Integer> consumer =
                (num) -> System.out.println(num + " * 10 = " + (num * 10));

        consumer.accept(100);
        consumer.accept(200);
        consumer.accept(400);
    }
}
