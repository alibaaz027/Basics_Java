package Constructor;

public class CurrentConstructor1 {

    CurrentConstructor1(){
        this(5);
        System.out.println("Default Constructor");
    }

    CurrentConstructor1(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        CurrentConstructor1 obj = new CurrentConstructor1(6);
    }
}
