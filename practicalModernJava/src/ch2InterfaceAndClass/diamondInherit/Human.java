package ch2InterfaceAndClass.diamondInherit;

public interface Human extends Animal {
    default void speak(){
        System.out.println("안녕");
    }
}
