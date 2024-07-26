package Constructor;

public class CurrentConstructor {

    CurrentConstructor(){
        System.out.println("Default Constructor");
    }

    CurrentConstructor(int x){
        this();
        System.out.println(x);

    }

    public static void main(String[] args) {
        CurrentConstructor obj = new CurrentConstructor(10);
    }
}
