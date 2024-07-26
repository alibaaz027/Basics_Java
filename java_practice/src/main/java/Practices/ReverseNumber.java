package Practices;




public class ReverseNumber {
    public static void main(String[] args) {
      String str = "Javed" , nstr ="";
      char ch ;
        System.out.println("Original String");
        System.out.println(str);

        for (int i =0;i<str.length();i++){

            ch = str.charAt(i);

            nstr= ch+nstr;

        }
        System.out.println("After Reverse = "+nstr);
    }
}
