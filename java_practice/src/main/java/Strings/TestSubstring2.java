package Strings;

import java.util.Arrays;

public class TestSubstring2 {
    public static void main(String[] args) {
        String text = "My is name Javed Ali";
        String[] sentence = text.split("\\.");
        System.out.println(Arrays.toString(sentence));
    }
}
