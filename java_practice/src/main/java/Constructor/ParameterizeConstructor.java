package Constructor;

public class ParameterizeConstructor {

    int id;
    String name;

    ParameterizeConstructor(int i , String n){
        id = i;
        name = n;

    }

    public void displayConstructor(){
        System.out.println(id +" "+name );
    }

    public static void main(String[] args) {
        ParameterizeConstructor obj = new ParameterizeConstructor(11,"Javed");
        obj.displayConstructor();

    }
}
