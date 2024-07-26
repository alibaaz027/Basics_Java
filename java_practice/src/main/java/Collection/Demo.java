package Collection;

import java.util.ArrayList;


public class Demo {

    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<String>();

        studentList.add("JAVED");
        studentList.add("AlI");

        System.out.print(studentList.get(0)+" ");
        System.out.println(studentList.get(1));
    }
}
