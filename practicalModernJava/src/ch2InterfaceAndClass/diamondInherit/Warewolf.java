package ch2InterfaceAndClass.diamondInherit;

public class Warewolf implements Human, Wolf {
    //겹치는 default method를 Override하지 않으면 error 발생
    @Override
    public void speak() {
        System.out.println("안녕Aww~");
    }
    //아니면 Wolf나 Human을 class로 만들고 extend하면 해결 가능
}
