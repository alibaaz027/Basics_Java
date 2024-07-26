package OOPs.FinalKeyWord;

/*
Que) Can we initialize blank final variable?
Yes, but only in constructor. For example:
 */
public class Bike10 {

    final int speedLimit;//blank final variable

    Bike10(){
        speedLimit=100;
        System.out.println(speedLimit);
    }

    public static void main(String[] args) {
        new Bike10();
    }

}
