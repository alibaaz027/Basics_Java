package OOPs.AbstractClass;
/*
An abstract class can have a data member,
 abstract method, method body (non-abstract method), constructor, and even main() method.
 */
abstract class Bike{

    Bike(){
        System.out.println("Constructor Bike");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Change the Gear");
    }
}
class Hero extends Bike{
    @Override
    void run() {
        System.out.println("Hero Bike is Running");
    }
}
public class TestAbstraction2 {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.run();
        h.changeGear();
    }
}
