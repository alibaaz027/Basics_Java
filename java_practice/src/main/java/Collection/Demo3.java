package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Demo3 {

    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        people.add("Javed");
        people.add("Shahid");
        people.add("Asad");
        people.add("Alex");

        System.out.println(people);

        System.out.println("------For Loop Way------");

        for (int i =0;i<people.size();i++){
            System.out.println(people.get(i));
        }
        System.out.println("------For Each Loop Way------");
        for (String s:people) {
            System.out.println(s);
        }

        System.out.println("-------------");

        for (String n:people
             ) {
            System.out.println(n);
        }

        System.out.println("-------------");

        for (String j: people) {
            System.out.println(j);
        }


        System.out.println("---Java 8 Lambda Expression & Stream Api-------  ");

        people.stream().forEach(names-> System.out.println(names));


        System.out.println("---------------");

        people.stream().forEach(ele-> System.out.println(ele));

        System.out.println("--without stream api---");

        people.forEach(list-> System.out.println(list));

        System.out.println("-----------");

        people.forEach(list-> System.out.println(list));

        System.out.println("-----iterator-------");

        Iterator<String> it = people.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("------");

        Iterator<String > se = people.iterator();
        while (se.hasNext()){
            System.out.println(se.next());
        }

        System.out.println("-----List with Other Collection-----");

        ArrayList<String> studentsName = new ArrayList<>(Arrays.asList("Javed","Shahid","Aamanat","Kapil"));
        System.out.println(studentsName);
    }

}
