package Generics;

public class GenericsExemple {

    public static void main(String[] a){

        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<String> printer1 = new Printer<>("Hello");
        printer1.print();
    }
}
