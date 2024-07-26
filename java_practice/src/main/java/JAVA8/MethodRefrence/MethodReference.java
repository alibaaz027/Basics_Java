package JAVA8.MethodRefrence;

public class MethodReference {

    public static void saySomething(){

        System.out.println("Hey i here");

    }

    public static void main(String[] args) {
     Sayable sayable = MethodReference::saySomething;
     sayable.say();
    }

}
