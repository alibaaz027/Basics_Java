package Wrapper;
//Autoboxing - Primitive to Wrapper

public class W1 {
    public static void main(String[] args) {
        int i = 20;
        Integer a = Integer.valueOf(i);//converting int into Integer explicitly
        Integer j =i;//autoboxing, now compiler will write Integer.valueOf(i) internally
        System.out.println(i+" "+a+" "+j);
    }
}
