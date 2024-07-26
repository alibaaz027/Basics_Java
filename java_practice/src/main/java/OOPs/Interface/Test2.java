package OOPs.Interface;
/*
In this example, the Printable interface has only one method,
 and its implementation is provided in the A6 class.
 */
public interface Test2 {
    void print();

class A5 implements Test2{
    @Override
    public void print() {
        System.out.println("Hello Interface");
    }
}

    public static void main(String[] args) {
        A5 a = new A5();
        a.print();
    }
}
