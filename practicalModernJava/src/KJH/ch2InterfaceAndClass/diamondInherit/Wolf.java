package KJH.ch2InterfaceAndClass.diamondInherit;

public interface Wolf extends Animal{
    default void speak(){
        System.out.println("Aww~");
 }
}
