package Practices;

import ObjectOps.A;

public class NaN {

    public static void main(String[] args) {

        //System.out.println(2/0);
        System.out.println(2.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(Math.sqrt(-1));

        System.out.println(Float.NaN == Float.NaN);
        System.out.println(Float.NaN != Float.NaN);

        double nan = 2.1 % 0;
        System.out.println((2.1 % 0) == nan);
        System.out.println(nan==nan);
        System.out.println(nan);
    }
}
