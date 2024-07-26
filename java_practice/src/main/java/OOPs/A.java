package OOPs;

public class A {

    protected void displays(){
        System.out.println("Hello its private");
    }
}
class B{
    public static void main(String[] args) {
        A obj = new A();
        obj.displays();
    }
}
