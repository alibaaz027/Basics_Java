package Strings;

public class TestStringConcatenation1 {
    public static void main(String[] args) {
        String s1 = "Javed"+" Ali";
        String s2 =(new StringBuffer().append("Hey").append(" Ya!").toString());
        System.out.println(s1);
        System.out.println(s2);

    }
}
