package OOPs.Polymorphism;

public class OverloadingCalculation1 {
    void sum(int a, double b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        OverloadingCalculation1 obj = new OverloadingCalculation1();
        obj.sum(12,12);
        obj.sum(12,12,12);
    }
}
