package PYJ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectExample {
    public static void main(String[] args){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("윤정민",1));
        personList.add(new Person("박재서",2));
        personList.add(new Person("김준형",3));
        personList.add(new Person("한성민",4));

        //최종 결과를 List객체로 리턴
        List<Person> sortedList=personList.stream().sorted().collect(Collectors.toList());
        for(Person person:sortedList){
            System.out.println(person);
        }

        List<String> set = personList.stream().map(Person::getName).collect(Collectors.toList());
        for(String d : set){
            System.out.println(d);
        }

        String joined = personList.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println(joined);

        int total = personList.stream().collect(Collectors.summingInt(Person::getAge));
        System.out.println(total);

    }
}
