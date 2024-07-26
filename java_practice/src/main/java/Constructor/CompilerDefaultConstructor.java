package Constructor;

public class CompilerDefaultConstructor {

    int id;
    String name;

    public void display2(){;
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        CompilerDefaultConstructor obj = new  CompilerDefaultConstructor();
        obj.display2();
    }
}
