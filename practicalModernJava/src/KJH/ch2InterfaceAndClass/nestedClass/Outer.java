package KJH.ch2InterfaceAndClass.nestedClass;

public class Outer {
    static String outerStaticString = "outerStaticString";
    int num = 10;
    String str = "outerString";
    String outerString = "outerField String";

    public void print(){
        System.out.println("=========outer============");
        System.out.println(num);
        System.out.println(str);
    }
  public class Inner {
      int num = 5;
      String str = "innerString";

      public void print(){
          System.out.println("=========inner============");
          System.out.println(num);
          System.out.println(str);
          System.out.println(outerString);
      };
  }
  public static class nested {
      int num = 3;
      String str = "nestedString";
      //내부중첩클래스는 외부 클래스(non-static) 멤버에 접근이 불가하다.
      //int nestedNumPlusOuterNum  = nestedNum + outerNum;
      public void print(){
          System.out.println("=========static inner(nested)============");
          System.out.println(num);
          System.out.println(str);
          System.out.println(outerStaticString);
          //static을 선언한 outerStaticString에는 접근이 가능
      }
  }
}
