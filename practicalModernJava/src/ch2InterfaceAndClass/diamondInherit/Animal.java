package ch2InterfaceAndClass.diamondInherit;

public interface Animal {
    int height = 0;
    int weight = 0;
    String name = null;
    default void speak() {
        System.out.println("Grr");
    }
}
