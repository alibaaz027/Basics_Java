package OOPs.StaticBlocks;

public class A {
    static {
        System.out.println("A");
    }
}
class B extends A{
    static {
        System.out.println("B");
    }

    public static void main(String[] args) {
        System.out.println("Hi");
    }
}