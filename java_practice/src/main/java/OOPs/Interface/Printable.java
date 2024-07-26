package OOPs.Interface;
/*
Q) Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity.
However, it is supported in case of an interface because there is no ambiguity.
 It is because its implementation is provided by the implementation class. For example:
 */

public interface Printable {
    void print();
}
 interface Showable{
    void print();
}

class A7 implements Printable,Showable{
    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A7 a = new A7();
        a.print();
    }
}