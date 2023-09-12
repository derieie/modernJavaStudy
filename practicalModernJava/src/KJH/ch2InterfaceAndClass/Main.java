package KJH.ch2InterfaceAndClass;

import KJH.ch2InterfaceAndClass.diamondInherit.Warewolf;
import KJH.ch2InterfaceAndClass.nestedClass.Outer;

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
