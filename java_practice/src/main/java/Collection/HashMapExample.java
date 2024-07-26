package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapExample {


    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<Integer,String>();

        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");

        HashMap<Integer,String> map2 = new HashMap<Integer,String>();

        map2.put(3,"C");
        map2.put(1,"A");
        map2.put(2,"B");

        HashMap<Integer,String> map3 = new HashMap<Integer,String>();
        map3.put(1,"A");
        map3.put(2,"B");
        map3.put(3,"C");
        map3.put(3,"D");

        System.out.println(map1.equals(map2));
        System.out.println(map2.equals(map3));

        System.out.println(map1.keySet().equals(map3.keySet()));

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,4,2));

        
    }

}
