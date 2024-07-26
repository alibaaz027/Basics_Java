package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {



        System.out.println("------------");

        int arr[]={34,45,56,6,7};

        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("------------");

        int a[] = new int[4];

        a[0]=10;
        a[1]=100;
        a[2]=101;
        a[2]=102;

        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }

        ArrayList<Object> materList = new ArrayList<>();

        materList.add("Hello");
        materList.add(27);
        materList.add("chalo");
        materList.add("Dehli");

        System.out.println("-------------");

        for (int i =0;i<materList.size();i++){
            System.out.println(materList.get(i));
        }

        System.out.println("-----------");

        for(Object b : materList){
            System.out.println(b);
        }
        System.out.println("===============");
        for (int j =0;j<materList.size();j++){
            System.out.println(materList.get(j));
        }

        System.out.println("------------");

        for (Object m : materList){
            System.out.println(m);
        }
    }
}
