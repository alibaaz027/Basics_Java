package JAVA8.LambdaExpression;

public class LambdaExpression3 {
    public static void main(String[] args) {
        Le3 l3 =()->{
          return "Assalamu Aliakum ";
        };
        System.out.println(l3.say());
        Le3 l4 =()->{
            return "Waliakum Assalam";
        };
        System.out.println(l4.say());
    }
}
