package OOPs.Polymorphism;

public class OverloadingCalculation2 {

    void sum(int a , int b){
        System.out.println("int invoked");
    }
    void sum(long a,long b){
        System.out.println("Long invoked");
    }

    public static void main(String[] args) {
        OverloadingCalculation2 obj = new OverloadingCalculation2();
        obj.sum(20,20);
       // obj.sum(12,15,77);
    }
}
