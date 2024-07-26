package JAVA8.LambdaExpression;

public class LambdaExpressionExample5 {
    public static void main(String[] args) {
        Addable ad1 = (a, b)->(a+b);{
            System.out.println(ad1.add(2,3));

        Addable ad2 = (int c, int d)->{
              return (c+d);

            };
            System.out.println(ad2.add(100,203));
        }
    }
}
