package Strings;

public class Testimmutablestring1 {
    public static void main(String[] args) {
        String s ="Javed";
       s = s.concat(" Ali");//explicitly assign it to the reference variable
        System.out.println(s);
    }
}
//In such a case, s points to the "Javed Ali".
// Please notice that still Sachin object is not modified.
