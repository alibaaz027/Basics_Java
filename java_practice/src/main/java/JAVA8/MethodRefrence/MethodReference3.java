package JAVA8.MethodRefrence;

import java.util.function.BiFunction;

class Arithmetic{
    public static int add(int a, int b){
        return a+b;
    }
}

public class MethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> adder = Arithmetic::add;
        int result = adder.apply(20,45);
        System.out.println(result);
    }
}
