package JAVA8.LambdaExpression;

public class LambdaExpression implements Le1 {

    public static void main(String[] args) {
        Le1 l1 = new Le1() {
            int width =10;
            @Override
            public void write() {
                System.out.println("Drawing "+width);
            }
        };
        l1.write();
    }

    @Override
    public void write(){}
}
