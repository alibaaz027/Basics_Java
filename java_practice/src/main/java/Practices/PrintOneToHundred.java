package Practices;

public class PrintOneToHundred {
    public static void main(String[] args) {
//        int one = 'B'/'B';
//        int two = 'A';
//        int result=one+two;
//        System.out.println(one+"+"+two+"=" +result);
//        String s1 ="..........";
//        for (int i =one;i<=(s1.length()*s1.length());i++) {
//            System.out.println(i);
    //    }

//        int zero = "".length();
//        int one =".".length();
//        int hundred = Integer.valueOf(Integer.toString(one)+Integer.toString(zero)+Integer.toString(zero));
//        System.out.println(hundred);
//        for (int i = one;i<=hundred;i++){
//            System.out.println(i);
        //
        // }
        int one = 'A'/'A';
        String sr = "..........";

        for (int i=one;i<=(sr.length()*sr.length());i++){
            System.out.println(one);
            one++;

         int zero = "".length();
         int oNe = ".".length();
         int hundred = Integer.valueOf(Integer.toString(oNe)+Integer.toString(zero)+Integer.toString(zero));

         for (int j = oNe;j<=hundred;j++){
             System.out.println(j);
         }

        }
    }
}
