package Practices;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumWLoopRecursion {
    public static void main(String[] args) {

        //Arrays.fill() method
        Object num[] = new Object[100];
        //System.out.println(num.length);

        Arrays.fill(num,new Object(){

        int count =0;
        @Override
                public String toString(){
            return Integer.toString(++count);
        }

    }
    );

        System.out.println(Arrays.toString(num));

        System.out.println();

        //BitSet class:

       String set= new BitSet() {{set(1,101);}}.toString();
        System.out.append(set,1,set.length());
    }
}
