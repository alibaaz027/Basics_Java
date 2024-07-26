package Constructor;

public class CopyConstructor1 {

    int id;
    String name;

    CopyConstructor1(int i , String n){
        id =i;
        name = n;

    }
    CopyConstructor1(CopyConstructor1 s){
        id = s.id;
        name= s.name;
    }


    public void displayCopyConstructor(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        CopyConstructor1 s1 = new CopyConstructor1(11,"Murtaza");
        CopyConstructor1 s2 = new CopyConstructor1(s1);
        s1.displayCopyConstructor();
        s2.displayCopyConstructor();

    }
}
