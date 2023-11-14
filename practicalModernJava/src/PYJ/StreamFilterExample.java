package PYJ;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilterExample {
    public static void main(String[] args){
        //travelList를 생성해서
        List<TravelInfo> travelList = TravelInfoDAO.createTravelList();
        //stravelStream객체를 생성
        Stream<TravelInfo> travelStream = travelList.stream();

        //필터 조건을 정의
       /*travelStream.filter(new Predicate<TravelInfo>(){
            //Predicate 인터페이스는 boolean 값을 처리
            @Override
            public boolean test(TravelInfo t){
                //필리핀으로 필터를 걸었음
                //true면 스트림에 포함, false면 제외
                return TravelInfoDAO.COUNTRY_PHILLIPHINE.equals(t.getCountry());
            }
            //필터되어서 리턴된 데이터들을 출력
        }).forEach(System.out::println);*/
       //<익명클래스로 구현ㅋ

        //람다 표현식으로 변경하면
        travelStream.filter((t)->TravelInfoDAO.COUNTRY_PHILLIPHINE.equals(t.getCountry())).forEach(System.out::println);
    }
}
