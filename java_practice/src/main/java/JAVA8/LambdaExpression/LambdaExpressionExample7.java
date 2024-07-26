package JAVA8.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Javed Ali");
        list.add("Firoj Alam");
        list.add("Ashraf Ali");
        list.add("Mohammad Qaiyum");

        list.forEach(
                (n)-> System.out.println(n)
        );
    }
}
