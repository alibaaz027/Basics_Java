package OOPs.Polymorphism;

class A{

    A greeting(){
        System.out.println("Hello");
        return this;//this - new A();
    }

}
class B extends A{

    @Override
    B greeting(){
       // super.greeting();//using for call super class
        System.out.println(" ٱلسَّلَامُ عَلَيْكُمْ ");
        return this;//this - new B();
    }

}
public class Covariant {

    public static void main(String[] args) {
        B b = new B();
        b.greeting();
    }

}
