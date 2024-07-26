package OOPs.Polymorphism;

class Human{
    void eat(){
        System.out.println("Eating...");
    }
}
class Javed extends Human{
    void eat(){
        System.out.println("Javed is Eating");
    }
}
class Ahmed extends Human{
    void eat(){
        System.out.println("Ahmed is Eating");
    }
}
class Bilal extends Human{
    void eat(){
        System.out.println("Bilal is Eating");
    }
}

public class TestPolymorphism3 {
    public static void main(String[] args) {
        Javed ali = new Javed();
        ali.eat();
        Ahmed javed = new Ahmed();
        javed.eat();
        Bilal md = new Bilal();
        md.eat();
    }
}
