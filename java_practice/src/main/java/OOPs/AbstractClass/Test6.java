package OOPs.AbstractClass;

abstract class Test6 {
    abstract void run();

}
class Test7 extends Test6{
    void run(){
        System.out.println("Running.....");
    }

    public static void main(String[] args) {
        Test7 t7 =new Test7();
        t7.run();
    }
}
