package JAVA8.LambdaExpression;

public class LambdaExpressionExample8 {
    public static void main(String[] args) {
        Sayable person = (message)->{
            String str1 ="Hello, EveryOne ";
            String str2 = str1+message;
            return str2;
        };
        System.out.println(person.sayable("I am Javed"));
    }
}
