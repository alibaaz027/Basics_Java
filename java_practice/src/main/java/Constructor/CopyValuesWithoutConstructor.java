package Constructor;

public class CopyValuesWithoutConstructor {

    int id;
    String name;

    CopyValuesWithoutConstructor(int i , String n){
        id =i;
        name=n;
    }
    CopyValuesWithoutConstructor(){}

    public void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        CopyValuesWithoutConstructor obj1 = new CopyValuesWithoutConstructor(12,"Javed");
        CopyValuesWithoutConstructor obj2 = new CopyValuesWithoutConstructor();
        obj2.id=obj1.id;
        obj2.name=obj1.name;
        obj1.display();
        obj2.display();
    }

}
