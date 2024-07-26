package OOPs.Polymorphism;

public class OverloadingCalculation3 {

    void sum(int a , long b){
        System.out.println("A method invoked");
    }
    void sum(long a , int b){
        System.out.println("B method invoked");
    }

    public static void main(String[] args) {
        OverloadingCalculation3 obj = new OverloadingCalculation3();
        //obj.sum(202,20);//ambiguous

    }
}
