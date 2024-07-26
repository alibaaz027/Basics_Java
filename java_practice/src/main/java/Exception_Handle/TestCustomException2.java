package Exception_Handle;

class MyCustomException extends Exception{

}
public class TestCustomException2 {
    public static void main(String[] args) {

        try {
            throw new MyCustomException();
        }catch (MyCustomException e){
            System.out.println(e.getMessage());
        }

    }
}
