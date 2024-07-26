package Static_Keyword;

 class StaticVariables {

    int id;
    String name;
    static String collegeName="RJIT";

    StaticVariables(int i,String n){

        id=i;
        name=n;

    }
    public void displayStudent(){
        System.out.println(id+" "+name+" "+collegeName);
    }
}
    public class TestStaticVariables1{
        public static void main(String[] args) {
            StaticVariables obj = new StaticVariables(1,"Javed");
            StaticVariables obj1 = new StaticVariables(2,"Murtaza");
            StaticVariables.collegeName="BBIT";
            obj.displayStudent();
            obj1.displayStudent();
        }
}