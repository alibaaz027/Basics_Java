package IIB;


//Let's see the simple example of instance initializer block that performs initialization.
public class Bike7 {

    int speed;
    Bike7(){
        System.out.println("Speed is :-"+speed);
    }

    {speed=100;}//instance initializer block

    public static void main(String[] args) {
        Bike7 b = new Bike7();
        Bike7 b1 = new Bike7();
    }

}
