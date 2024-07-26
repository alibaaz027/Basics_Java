package OOPs.Interface;

/*
Multiple inheritance in Java by interface
 */
public interface PrintMultipleInheritance {
    void print();
}
interface Print2{
    void show();
}
class A8 implements PrintMultipleInheritance,Print2{
    @Override
    public void print() {
        System.out.println("Print is Successful");
    }

    @Override
    public void show() {
        System.out.println("Show data is successful");
    }

    public static void main(String[] args) {
        A8 obj = new A8();
        obj.print();
        obj.show();
    }
}