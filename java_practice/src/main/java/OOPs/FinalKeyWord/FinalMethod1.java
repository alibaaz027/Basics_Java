package OOPs.FinalKeyWord;

/*
Q) Is final method inherited?
Ans) Yes, final method is inherited but you cannot override it. For Example:
 */
public class FinalMethod1 {

    final void run(){
        System.out.println("Final Method is Inherit");
    }

}
class Result extends FinalMethod1{
    public static void main(String[] args) {
       new Result().run();
    }
}
