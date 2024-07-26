package OOPs.Polymorphism;
/*
Java Runtime Polymorphism with Multilevel Inheritance
Let's see the simple example of Runtime Polymorphism with multilevel inheritance.
 */

public class Company {
    void name(){
        System.out.println("ALL India IT Companies");
    }
}
class HP extends Company{
    @Override
    void name() {
        System.out.println("HP India");
    }
}
class Sony extends HP{
    @Override
    void name() {
        System.out.println("Sony India");
    }

    public static void main(String[] args) {
        Company company,hp,sony;
        company=new Company();
        hp = new HP();
        sony= new Sony();
        company.name();
        hp.name();
        sony.name();
    }
}