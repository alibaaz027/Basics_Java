package Collection;

import java.util.ArrayList;

public class VirtualCapacity {

    public static void main(String[] args) {

        ArrayList<Object> ar = new ArrayList<Object>();


        System.out.println(ar.size());

        ar.add(343);
        ar.add(87493);
        System.out.println(ar);

        System.out.println("---------------");

        for (Object r: ar) {
            System.out.println(r);

        }
    }
}
