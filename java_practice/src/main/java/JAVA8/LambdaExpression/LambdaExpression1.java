package JAVA8.LambdaExpression;

public class LambdaExpression1 {
    public static void main(String[] args) {
        int width =20;
        Le2 l2 =()->{
            System.out.println("Drawing "+width);
        };
        l2.write1();
    }
}
