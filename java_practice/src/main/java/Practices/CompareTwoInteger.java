package Practices;

public class CompareTwoInteger {

    /*
    Compare Two Integer (Wrapper Class Variable (Internal Caching))
    -128 to 127
    */
    public static void main(String[] args) {
        Integer num1 =128 ;
        Integer num2 = 128;

        if(num1==num2){
            System.out.println("Both are Equal");
        }else {
            System.out.println("Both are not Equal");
        }
    }
}
