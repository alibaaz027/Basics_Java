package Static_Keyword;

class StaticMethod {

    int id;
    String name;

    static String collegeName="GPS";

     static void change(){
        collegeName="RJIT";
    }

    StaticMethod(int i,String n){
        id=i;
        name=n;
    }

    public void display(){
        System.out.println(id+" "+name+" "+collegeName);
    }

}

    public class Test1{

        public static void main(String[] args) {
            StaticMethod.change();
            StaticMethod s1 = new StaticMethod(1,"Javed");
            StaticMethod s2 = new StaticMethod(2,"Ali");
            StaticMethod s3 = new StaticMethod(3,"Asad");
            //StaticMethod s4 = null;
            s1.display();
            s2.display();
            s3.display();
        }

}
