package Strings;

public class TestStringComparison3 {
    public static void main(String[] args) {
        String s1 = "Javed";
        String s2 = "Javed";
        String s3 = new String("Javed");
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in non-pool)
    }
}
