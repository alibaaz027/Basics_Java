package OOPs.Interface;

public interface StaticInterface {
    void print();
    static int cube(int a){
        return a*a*a;
    }
}
class A11 implements StaticInterface{
    @Override
    public void print() {
        System.out.println("Print is Happening Here");
    }
}
class Test7 {
    public static void main(String[] args) {
        StaticInterface obj = new A11();
        obj.print();
        System.out.println(StaticInterface.cube(3));

    }
}