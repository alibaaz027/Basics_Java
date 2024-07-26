package Collection;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> student = new  ArrayList<String>();
        ArrayList<String> student1= new ArrayList<String>();



        student.add("Javed");
        System.out.println(student.get(0));

        System.out.println("-----------");

        student1.add("Adam");
        student1.add("Isa");

        for (int i =0;i<student1.size();i++){
            System.out.println(student1.get(i));
        }

    }
}
