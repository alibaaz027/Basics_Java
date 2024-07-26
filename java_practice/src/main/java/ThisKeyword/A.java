package ThisKeyword;

public class A {

    public void m1(){
        System.out.println("M1 method");
    }

    A(){
        m1();
    }

    public static void main(String[] args) {
        A a= new A();

    }
}
