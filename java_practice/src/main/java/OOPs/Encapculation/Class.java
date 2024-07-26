package OOPs.Encapculation;

public class Class {
    private int id;
    private String name;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
   public void setName(String name){
        this.name=name;
   }
   public String getName(){
        return name;
   }
}
class Test{
    public static void main(String[] args) {
        Class c = new Class();
        c.setId(1);
        c.setName("Javed Ali");
        System.out.println(c.getId());
        String n =  c.getName();
        System.out.println(n);
    }
}
