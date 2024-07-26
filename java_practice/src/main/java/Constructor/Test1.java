package Constructor;

class A{

     A getA(){
        return  this;
    }

    void msg(){
        System.out.println("Hello Java");
    }

}


public class Test1 {
    public static void main(String[] args) {
        new A().getA().msg();
    }


}
