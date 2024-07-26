package Practices;

public class SwapWthirdV {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swap A= "+a+" And B= "+b);

        a = a+b;//10+20=30
        b= a-b;//30-20=10
        a=a-b;//30-10=20;
        System.out.println("After Swap A= "+a+" And B= "+b);
    }
}
