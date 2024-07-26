package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class IndexOf {

    public static void main(String[] args) {

        ArrayList<String>  jodi = new ArrayList<String>();

        jodi.add("Javed");
        jodi.add("Bilal");
        jodi.add("Jamal");

        int index = jodi.indexOf("Jamal");

        System.out.println(index);

        System.out.println("---------------------");

        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Murtuza","Lisa","Mona","Javed","Murtuza"));

        int list = myList.lastIndexOf("Murtuza");

        System.out.println(list);

        System.out.println("------------");

        myList.remove(0);
        System.out.println(myList);

        System.out.println("---------------");

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        num.removeIf(number -> number%2 !=0);
        System.out.println(num);

        System.out.println("-------------------------");

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Javed","Harry","Bilal","Javed","Jamal"));
        nameList.retainAll(Collections.singleton("Javed"));
        System.out.println(nameList);

        System.out.println("---------------------");

        ArrayList<Integer> number1 = new ArrayList<Integer>(Arrays.asList(3,4,5,2,6,7,67,23,56,33,55,88,44,454));

        ArrayList<Integer> subList = new ArrayList<Integer>(number1.subList(2,9));
        System.out.println(subList);

        System.out.println("--------------------");

        ArrayList<String> newList = new ArrayList<>(Arrays.asList("Javed","Harry","Bilal","Javed","Jamal","Shahid"));
        Object arr[] = newList.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
