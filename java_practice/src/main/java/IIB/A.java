package IIB;

//Hence Prove Program of instance initializer block that is invoked after super()
public class A {
    A(){
        System.out.println("A Constructor");
    }
}
class B2 extends A{

    B2(){
       // super();
        System.out.println("B2 Constructor ");
    }
    {
        System.out.println("IIB Invoked");
    }

    public static void main(String[] args) {
        B2 b2 = new B2();
    }
}
