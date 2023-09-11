package ch2InterfaceAndClass;

import ch2InterfaceAndClass.diamondInherit.Human;
import ch2InterfaceAndClass.diamondInherit.Warewolf;
import ch2InterfaceAndClass.diamondInherit.Wolf;
import ch2InterfaceAndClass.nestedClass.Outer;

public class Main {
    public static void main(String[] args) {
        //nested class
        outerInner();
        inherit();
    }

    public static void outerInner() {
        Outer out = new Outer();
        Outer.Inner inner = out. new Inner();
        Outer.nested nested = new Outer.nested();
        out.print();
        inner.print();
        nested.print();
    }

    public static void inherit() {
        Warewolf warewolf = new Warewolf();
        warewolf.speak();
    }
}
