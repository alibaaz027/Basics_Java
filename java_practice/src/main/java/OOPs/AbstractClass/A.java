package OOPs.AbstractClass;

/*
Another real scenario of abstract class
The abstract class can also be used to provide some implementation of the interface. In such case,
 the end user may not be forced to override all the methods of the interface.
 */
public interface A {
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A{
    @Override
    public void c() {
        System.out.println("C");
    }


}
class M extends B{
    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }

    @Override
    public void d() {
        System.out.println("D");
    }
}
class Test4{
    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
