package Static_Keyword;

public class Counter1 {

    static int count;

    Counter1(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter1 obj = new Counter1();
        Counter1 obj1 = new Counter1();
        Counter1 obj2 = new Counter1();
    }
}
