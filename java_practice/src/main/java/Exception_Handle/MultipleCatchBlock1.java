package Exception_Handle;

public class MultipleCatchBlock1 {
    public static void main(String[] args) {


        try {
            int b =30/0;
            System.out.println(b);
            int a[]= new  int[5];
            for (int i =1;i<= a.length;i++){
                System.out.println(a[i]);
            }
        }catch (ArithmeticException arithmeticException){
            System.out.println("ArithmeticException occur");
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("ArrayIndexOutOfBoundsException occur");
        }catch (Exception exception){
            System.out.println("Parent Exception");
        }

    }
}
