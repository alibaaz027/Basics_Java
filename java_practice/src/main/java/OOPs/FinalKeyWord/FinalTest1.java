package OOPs.FinalKeyWord;

//Example of final variable
public class FinalTest1 {

   final int a =100;//final variable

    void show(){
       // a=200;//cannot change final variable value
        System.out.println(a);
    }

    public static void main(String[] args) {
        FinalTest1 f = new FinalTest1();
        f.show();
    }

}
//Output:Compile Time Error
