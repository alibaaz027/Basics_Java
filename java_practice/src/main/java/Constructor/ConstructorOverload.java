package Constructor;

public class ConstructorOverload {

    int id;
    String name;
    int age;

    ConstructorOverload(int i , String n){
        id =i;
        name =n;
    }
    //overload here
    ConstructorOverload(int i , String n,int a){
        id=i;
        name = n;
        age=a;
    }

    public void displayConstructorOverload(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        ConstructorOverload obj1 = new ConstructorOverload(1,"Javed");
        ConstructorOverload obj2 = new ConstructorOverload(2,"Ali",25);
        obj1.displayConstructorOverload();
        obj2.displayConstructorOverload();

    }
}
