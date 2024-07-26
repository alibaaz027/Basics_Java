package OOPs.Interface;


public interface A12 {
    void a();
    void b();
    void c();
    void d();
    void e();
}
abstract class B implements A12{
    @Override
    public void a() {
        System.out.println("A");
    }
}
class M extends B{
    @Override
    public void b() {
        System.out.println("B");
    }

    @Override
    public void c() {
        System.out.println("C");
    }

    @Override
    public void d() {
        System.out.println("D");
    }

    @Override
    public void e() {
        System.out.println("E");
    }
}
class Test34{
    public static void main(String[] args) {
     A12 a12 = new M();
     a12.a();
     a12.b();
     a12.c();
     a12.d();
     a12.e();
    }
}