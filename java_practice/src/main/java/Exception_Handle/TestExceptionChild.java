package Exception_Handle;

import java.io.IOException;

public class TestExceptionChild extends Parent1{

    // overriding the method in child class
    // gives compile time error
    void msg(){ //throws IOException {
        System.out.println("TestExceptionChild");
    }

    public static void main(String args[]) {
        Parent1 parent1 = new TestExceptionChild();
        parent1.msg();
    }
}
