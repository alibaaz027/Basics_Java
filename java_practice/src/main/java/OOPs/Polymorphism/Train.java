package OOPs.Polymorphism;

/*
Java Runtime Polymorphism with Data Member
A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.

In the example given below, both the classes have a data member speedLimit. We are accessing the data member by the reference variable of Parent class which refers to the subclass object.
 Since we are accessing the data member which is not overridden, hence it will access the data member of the Parent class always.
 */

public class Train {
    int speedLimit = 90;
}
    class BulletTrain extends Train {
        int speedLimit = 250;

        public static void main(String[] args) {
            BulletTrain b =new BulletTrain();
            System.out.println(b.speedLimit);
        }

}


