package YJM.src.main.java.practiceMethodReference;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest {

    /**
     * 1 주어진 자바 기본 코드로 구현
     */
    public static void testFirst() {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("Loki");
        list.add("season 2");

        System.out.println("========= 1 foreach문을 사용할 경우");
        for(String entity : list) {
            System.out.println(entity);
        }
        
        System.out.println("========= 2 stream과 람다로 축약");
        list.stream().forEach((String entity) -> System.out.println(entity));

        System.out.println("========= 3 명확한 파라미터인 System.out.println 축약");
        list.stream().forEach(System.out::println);
    }

    /**
     * 2 메소드를 만들어 참조
     */
    public static void testSecond() {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("She hulk");
        list.add("wait second season");

        System.out.println("========= 정적 메소드 참조");
        list.stream().forEach(MethodReferenceTest::excuteMethod);

        System.out.println("========= 한정적 메서드 참조");
        list.stream().forEach(MethodReferenceTest.of()::toUpperCase);

        System.out.println("========= 비한정적 메서드 참조");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public static MethodReferenceTest of() {
        return new MethodReferenceTest();
    }

    public static void excuteMethod(String entity){
        if(entity != null && !"".equals(entity)){
            System.out.println("Contents : " + entity);
            System.out.println("Length : " + entity.length());
        }
    }

    public void toUpperCase(String entity) {
        System.out.println(entity.toUpperCase());
    }



}
