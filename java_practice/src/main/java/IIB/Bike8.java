package IIB;

//What is invoked first, instance initializer block or constructor?
public class Bike8 {
    int speed;

    Bike8(){
        System.out.println("Constructor1");
    }
    {
        System.out.println("IIB");
    }
    Bike8(int a){
        System.out.println("Constructor2");
    }


    public static void main(String[] args) {
        Bike8 b1 = new Bike8();
        Bike8 b2 = new Bike8(10);
    }
}
/*
In the above example, it seems that instance initializer block is firstly invoked but NO. Instance intializer block is invoked at the time of object creation. The java compiler copies the instance initializer block in the constructor after the first statement super(). So firstly, constructor is invoked. Let's understand it by the figure given below:
Note: The java compiler copies the code of instance initializer block in every constructor.

public class Bike8 {
    int speed;

    Bike8() {
        System.out.println("IIB");//here The java compiler copies the code of instance initializer block in every constructor.
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Bike8();
        new Bike8();
    }
}
 */
