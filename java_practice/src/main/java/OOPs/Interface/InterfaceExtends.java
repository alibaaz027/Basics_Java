package OOPs.Interface;

/*
A class implements an interface, but one interface extends another interface.
 */

public interface InterfaceExtends {
    void print();
}
interface Print3 extends InterfaceExtends{
    void show();
}
class A9 implements Print3{
    @Override
    public void print() {
        System.out.println("Print is done");
    }

    @Override
    public void show() {
        System.out.println("Show is done");
    }

    public static void main(String[] args) {
        A9 obj1 = new A9();
        obj1.print();
        obj1.show();
    }
}