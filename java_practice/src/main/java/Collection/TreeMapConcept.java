package Collection;

import java.util.TreeMap;

public class TreeMapConcept {
    public static void main(String[] args) {

        TreeMap<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(2000,"Asad");
        treeMap.put(3000,"Murtuza");
        treeMap.put(5000,"Shahid");
        treeMap.put(4000,"Javed");
        treeMap.put(1000,"Adnaan");

        System.out.println(treeMap);

        treeMap.forEach((k,v)->System.out.println("Key = "+ k +" Value ="+v));

    }
}
