package Constructor;

public class A5 {

    A5(){
        System.out.println(this);
    }

    void m1(){

        System.out.println(this);

    }


    public static void main(String[] args) {
        A5 obj = new A5();
        System.out.println(obj);
        obj.m1();
    }
}
