package PYJ;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamDistinctExample {
    public void test(){
        //Person객체로 리스트 생성
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("윤정민",1));
        personList.add(new Person("박재서",2));
        personList.add(new Person("김준형",3));
        personList.add(new Person("한성민",4));
        personList.add(new Person("윤정민",1)); //중복데이터
        //중복제거안됨
        //eqauls를 다시 오버라이드 해서 비교해주면 중복제거된다
        personList.stream().distinct().forEach(System.out::println);

    }

    public static void main(String[] args){
        new StreamDistinctExample().test();
    }
}
