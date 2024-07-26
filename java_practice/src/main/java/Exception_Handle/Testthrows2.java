package Exception_Handle;

import java.io.IOException;

//throws keyword without occur any exception
//In case we declare the exception, if exception does not occur, the code will be executed fine.
public class Testthrows2 {

    void m1() throws IOException {
        System.out.println("hi");
    }

    public static void main(String[] args) throws IOException{//declare exception
        Testthrows2 obj = new Testthrows2();
        obj.m1();
    }
}
