package PYJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamDistinctExample2 {
    //우리가 equals메서드를 오버라이드 할수 없는 경우...
    public static <T> Predicate<T> distinctByKey(Function<? super T,?> key){
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(key.apply(t), Boolean.TRUE) == null;
    }
    //putIfAbsent key값이 존재하면 map의 v, 없으면 key값을 map에 넣구 null을 반환
    public void test(){
        //Person객체로 리스트 생성
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("윤정민",1));
        personList.add(new Person("박재서",2));
        personList.add(new Person("김준형",3));
        personList.add(new Person("한성민",4));
        personList.add(new Person("윤정민",1)); //중복데이터

        personList.stream().filter(distinctByKey(b->(b.getName()+b.getAge()))).forEach(System.out::println);
        //personList의 스트림객체생성
        //filter 메서드 호출
        //filter의 입력 파라미터인 Predicate 객체를 생성하기 위해 distinctByKey 메서드가 호출
        //distinctByKey로 Predicate 객체를 생성
        //외부에서 선언된 Map객체를 참조
        //스트림 내부에서 Precicate 객체가 반복 실행되면서 t/f 값에 따라 필터링
        //필터링 결과를 forEach가 호출

    }

    public static void main(String[] args){
        new StreamDistinctExample2().test();
    }
}
