package Collection;

import java.util.*;



public class ArraysListConcept {


    public static void main(String[] args) {

        ArrayList<String> friends = new ArrayList<>();

        LinkedList<Integer> l = new LinkedList<>();


        friends.add("Vicky");
        friends.add("Bittu");
        friends.add("Tikshen");
        friends.add("Yespal");
        friends.add("Zoya*");
        friends.add("Monu");
        friends.add("Arun");
        friends.add("Pradeep");
        friends.add("Harshid");
        friends.add("Puja");
        friends.add("Sambhavi");
        friends.add("Supriya");
        friends.add("Sonu");
        friends.add("Priyanshu");
        friends.add("Irshad");
        friends.add("Bakshi*");
        friends.add("Prashant");
        friends.add("Rajat");
        friends.add("Amanat*");
        friends.add("Javed Ahmed*");
        friends.add("Asad*");
        friends.add("Nasir*");
        friends.add("Russel*");
        friends.add("Shahid*");
        friends.add("Noor");
        friends.add("Adnaan*");
        friends.add("Aqueeb Jawed*");
        friends.add("Omer*");
        friends.add("Favas*");
        friends.add("Taha");
        friends.add("Mushtaq");
        friends.add("Ballari*");
        friends.add("Asif");
        friends.add("Murtuza*");
        friends.add("Aaghaz");

        System.out.println(friends);

        System.out.println("--------------");

        for (int i=0;i<friends.size();i++){
            System.out.println(friends.get(i));
        }

        System.out.println("---------------------");

        for (String fr : friends) {
            System.out.println(fr);
        }

        System.out.println("__------------___");

        for (String fr: friends) {
            System.out.println(fr);
        }

        System.out.println("--------_______________----------");

        friends.forEach(frList-> System.out.println(frList));

        System.out.println("****************************************");

        Iterator<String> fr = friends.iterator();

        while (fr.hasNext()){
            System.out.println(fr.next());
        }


    }
}
