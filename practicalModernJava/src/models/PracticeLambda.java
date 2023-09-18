package models;

public class PracticeLambda {
    public static void exerciseLambda(){
        FunctionalInterface getRemain = (x, y) -> { return x % y; };
        FunctionalInterface subtract = (one, two) -> one - two;
        FunctionalInterface getABS = (v1 , v2) -> {
            if ( v1 * v2 < 0 ) {
                return -v1 * v2;
            } else {
                return v1 * v2;
            }
        };

        FunctionalInterface2 addString = (a,b) -> a + b;

        System.out.println("remain : " + getRemain.calc(7,3));
        System.out.println("subtract : " + subtract.calc(1,9));
        System.out.println("complicated1 : " + getABS.calc(3,9));
        System.out.println("complicated2 : " + getABS.calc(3,-9));
        System.out.println("addString L " + addString.stringFunc("HELLO", "BYE"));

    }
}
