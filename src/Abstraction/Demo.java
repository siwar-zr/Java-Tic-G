package Abstraction;

abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing Music..");
    }
}

abstract class Ford extends Car{
    public abstract void fly();

    @Override
    public void drive() {
        System.out.println("Driving Ford..");
    }
}

class AdvancedFord extends Ford{
    @Override
    public void fly() {
        System.out.println("Flying..");
    }

}
public class Demo {
    public static void main(String[] args) {

        Car obj = new AdvancedFord();
        obj.drive();
        obj.playMusic();

    }
}
