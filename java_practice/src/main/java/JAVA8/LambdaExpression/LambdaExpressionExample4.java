package JAVA8.LambdaExpression;

public class LambdaExpressionExample4 {
    public static void main(String[] args) {
        Say s = (name)->{
            return "Hello, "+name;
        };
        System.out.println(s.say1("Javed"));
        Say s1 =(name)->{
          return "Hello, "+name;
        };
        System.out.println(s1.say1("Ali"));
    }
}
