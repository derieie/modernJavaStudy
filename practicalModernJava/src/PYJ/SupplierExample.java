package PYJ;

import java.util.function.Supplier;

public class SupplierExample {
    public static String excuteSupplier(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args){
        String version = "java upgrade book, version 0.1 BETA";
        Object vv = SupplierExample.excuteSupplier(()->{return version;});
        System.out.println("result>>"+vv);

        Supplier<String> test = ()->"Hello~~~";
        System.out.println("test >>>> " + test.get());
    }
}
