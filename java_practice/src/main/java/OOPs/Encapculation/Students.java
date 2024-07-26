package OOPs.Encapculation;

public class Students {

    private int id ;
    private String name;

    void show(int id , String name){
        this.id=id;
        this.name=name;
        System.out.println("Name ="+name+",ID="+id);
    }

}
class Test9{
    public static void main(String[] args) {
        Students s = new Students();
        s.show(2,"Ali");
    }
}
