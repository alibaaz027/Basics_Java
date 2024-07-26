package OOPs.FinalKeyWord;

/*
static blank final variable
A static final variable that is not initialized at the time of declaration is known as static blank final variable.
It can be initialized only in static block.
 */
public class StaticBlankFinal {
   static final int a ;//static blank final variable
    static {
        a=10;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlankFinal.a);
    }
}
