package JAVA8.FunctionalInterfaces;

public class FunctionalInterfaces implements FunctionalInterfaces1 {
    @Override
    public void write(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaces f1 = new FunctionalInterfaces();

        f1.write("hello");
    }
}
