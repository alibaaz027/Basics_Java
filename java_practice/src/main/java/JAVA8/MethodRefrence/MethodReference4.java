package JAVA8.MethodRefrence;

import java.util.function.BiFunction;

class Arithmetic1{
    public static int add1(int a,int b){
        return a+b;
    }
}

public class MethodReference4 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> adder1 = Arithmetic1::add1;
        int result1 = adder1.apply(100,200);
        System.out.println(result1);
    }
}
