package PYJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMapExample {
    public static void main(String[] args){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("윤정민",20));
        personList.add(new Person("박재서",20));
        personList.add(new Person("김준형",10));
        personList.add(new Person("한성민",10));

        //Stram<Person> -> Strem<String>으로 변환
        Stream<String> personStream = personList.stream().map((Person p) -> p.toString());
        personStream.forEach(System.out::println);
        //한줄로 ㅋ
        //personList.stream().map((Person p) -> p.toString()).forEach(System.out::println);

        IntStream intStream = personList.stream().mapToInt((Person p) -> p.getAge());
        intStream.forEach(System.out::println);

        Map<Integer, List<Person>> ggg= personList.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(ggg);
    }
}
