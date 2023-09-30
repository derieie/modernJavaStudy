package PYJ;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args){
        //BinaryOperator는 입력파라미터 2개인 메소드 지원
        BinaryOperator<Integer> operatorA = (Integer a, Integer b) -> a+b;

        System.out.println(operatorA.apply(1,2));
        System.out.println(operatorA.apply(2,3));
        System.out.println(operatorA.apply(3,4));
    }
}
