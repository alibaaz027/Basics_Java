package Strings;

import ObjectOps.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ColJoining {
    public static void main(String[] args) {
        List<String> str =Arrays.asList("abc","def","ghi");
        String str1 = str.stream().collect(Collectors.joining(" "));
        System.out.println(str1.toString());
    }
}
