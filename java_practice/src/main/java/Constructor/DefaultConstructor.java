package Constructor;

public class DefaultConstructor {

    public DefaultConstructor(){
        System.out.println("Default Constructor is calling");
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        DefaultConstructor obj1 = new DefaultConstructor();
    }
}
