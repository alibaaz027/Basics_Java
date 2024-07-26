package Exception_Handle;

import java.io.IOException;

public class Testthrows1 {


    void m3() throws IOException {
        throw new IOException("Device Error");
    }
    void m2(){
        try {
            m3();
        }catch (Exception a){
            System.out.println("Exception Handle");
        }

    }

    void m1(){
        m2();
    }

    public static void main(String[] args) {
        Testthrows1 obj = new Testthrows1();
        obj.m1();
        System.out.println("normal flow");
    }
}
