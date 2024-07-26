package Strings;

import java.util.StringJoiner;

public class StrJoiner {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner(" ");
        s1.add("Cali");
        s1.add("Flower");
        System.out.println(s1.toString());

    }
}
