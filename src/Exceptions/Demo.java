package Exceptions;

class SiwarException extends Exception{

    public SiwarException(String message){
        super(message);
    }
}

public class Demo {
    public static void main(String a[]){

        int i = 20;
        int j = 0;

        try{
            j=18/i;
            if (j==0){
                throw new SiwarException("Result can't be zero ");
            }
        }
        catch(SiwarException e){
            j=18;
            System.out.println("This is the default output "+e);
        }
        catch(Exception e){
            System.out.println("Something wrong "+e);
        }


        System.out.println(j);
        System.out.println("Bye");

    }
}
