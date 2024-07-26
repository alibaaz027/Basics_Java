package OOPs.FinalKeyWord;

public class FinalParameter {

     int sum(final int n){
        //n =n+5;//can't be changed as n is final
        return  n*n*n;
    }

    public static void main(String[] args) {
         FinalParameter finalParameter = new FinalParameter();
        System.out.println(finalParameter.sum(2));
    }

}
