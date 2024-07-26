package OOPs.SuperKeyword;

//super example: real use
class People{
    int id ;
    String name;

    People(int id , String name){
        this.id=id;
        this.name=name;
    }
}
class Employee extends People{

    float salary;
   Employee(int id , String name , float salary){
       super(id, name);//reusing parent constructor
       this.salary=salary;
   }

}
public class TestSuper5 {
    public static void main(String[] args) {
        Employee e = new Employee(1,"Javed",45000f);
        System.out.println(e.id+" "+e.name+" "+e.salary);
    }
}
