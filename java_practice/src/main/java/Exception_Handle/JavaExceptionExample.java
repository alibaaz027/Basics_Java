package Exception_Handle;

public class JavaExceptionExample {
    public static void main(String[] args) {

        try {
            int a = 100/0;
            System.out.println(a);
        }catch (Exception exception){
            System.out.println(exception);
        }
        finally {
            System.out.println("closing Here");
        }


    }
}
