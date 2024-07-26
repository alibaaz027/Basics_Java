package Constructor;

public class Constructor1 {

    int id;
    String name;

    public Constructor1(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Constructor1 obj3 = new Constructor1(1,"ali");
        System.out.println(obj3.id);
        System.out.println(obj3.name);
    }
}
