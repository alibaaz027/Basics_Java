package IIB;

//Another example of instance block
public class A1 {
    A1(){
        System.out.println("A1 Constructor Invoked");
    }
}
class B1 extends A1{
    B1(){
        super();
        System.out.println("B1 constructor Invoked");
    }
    B1(int a){
        System.out.println("B1 Constructor 2 Invoked "+a);
    }
    {
        System.out.println("IIB Invoked");
    }

    public static void main(String[] args) {
        B1 b1 = new B1();
        B1 b2 =new B1(10);
    }
}
