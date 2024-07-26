package Exception_Handle;

public class Child3 extends Parent3{

    @Override
    void msg() throws ArithmeticException {
        System.out.println("Child Exception");
    }

    public static void main(String[] args) throws Exception {
        Parent3 p = new Child3();
        p.msg();
    }
}
