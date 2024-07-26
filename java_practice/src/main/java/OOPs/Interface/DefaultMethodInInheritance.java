package OOPs.Interface;

public interface DefaultMethodInInheritance {
    void print();
    default int add(int a , int b){
        return a+b;
    }
    default void msg(){
        System.out.println("Default Method");
    }
}
class A10 implements DefaultMethodInInheritance{
    @Override
    public void print() {
        System.out.println("Print is done here");
    }
}
class Test6{
    public static void main(String[] args) {
        DefaultMethodInInheritance obj = new A10();
        int a = obj.add(3,6);
        obj.msg();
        System.out.println(a);
        obj.print();
    }
}