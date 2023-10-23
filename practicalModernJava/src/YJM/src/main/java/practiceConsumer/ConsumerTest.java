package YJM.src.main.java.practiceConsumer;

import java.util.function.Consumer;

public class ConsumerTest {

    // Consumer 조합 예제
    public static void testMain() {
        Consumer<String> consmer = (String text) -> System.out.println("Hello : " + text);
        Consumer<String> consumerAndThen = (String text) -> System.out.println("Text Length is : "+ text.length());

        //Consumer 인터페이스 조합
        consmer.andThen(consumerAndThen).accept("JavaJJAva");
    }
    
}
