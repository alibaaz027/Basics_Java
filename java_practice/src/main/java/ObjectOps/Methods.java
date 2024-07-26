package ObjectOps;

public class Methods {

    public  int sum(int a, int b){

        return a+b;

    }

    public static void main(String[] args) {

        Methods methods = new Methods();

        int sum1 = methods.sum(3, 3);
        System.out.println(sum1);
    }

}
