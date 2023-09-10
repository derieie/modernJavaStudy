package ch2InterfaceAndClass;

import ch2InterfaceAndClass.nestedClass.Outer;

public class Main {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inner = out. new Inner();
        Outer.nested nested = new Outer.nested();
        out.print();
        inner.print();
        nested.print();
    }
}
