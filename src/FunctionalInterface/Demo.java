package FunctionalInterface;

@FunctionalInterface
interface A{
    int poly(int i);
}



public class Demo {
    public static void main(String a[]){
        A obj = i -> (int) Math.pow(i,2)+2*i+5;
        int result = obj.poly(7);
        System.out.println("le polynome de 7 est "+ result);
    }
}
