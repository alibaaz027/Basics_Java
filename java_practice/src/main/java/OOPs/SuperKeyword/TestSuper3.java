package OOPs.SuperKeyword;

//super is used to invoke parent class constructor.
class A{
    A(){
        System.out.println("Class A");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("Class B");
    }
}

public class TestSuper3 {
    public static void main(String[] args) {
        B b = new B();
    }
}
