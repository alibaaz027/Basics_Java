package Exception_Handle;

public class ExceptionPropagation {

    static void m3(){
        System.out.println(10/0);
    }
    static void m2(){
      try {
          m3();
      }catch (Exception a){
          System.out.println("Exception Handle!");
      }
    }
    static void m1(){
        m2();
    }
    public static void main(String[] args) {
        m1();
    }
}
