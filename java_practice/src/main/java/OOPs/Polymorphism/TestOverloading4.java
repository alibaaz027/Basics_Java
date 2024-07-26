package OOPs.Polymorphism;

public class TestOverloading4 {

    /*Can we overload java main() method?
    Yes, by method overloading. You can have any number of main methods in a class
    by method overloading. But JVM calls main()
    method which receives string array as arguments only.
    Let's see the simple example:*/

    public static void main(String[] args) {
        System.out.println("String[] args");
    }

    public static void main(String args) {
        System.out.println("(String args");
    }

    public static void main() {
        System.out.println("No Arguments");

    }
}
