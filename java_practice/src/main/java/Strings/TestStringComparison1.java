package Strings;

public class TestStringComparison1 {
    public static void main(String[] args) {
        String s1 ="Javed";
        String s2 = "Javed";
        String s3 = new String("Javed");
        String s4 = "Ali";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

    }
}
