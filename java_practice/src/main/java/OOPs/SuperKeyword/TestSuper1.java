package OOPs.SuperKeyword;

//1) super is used to refer immediate parent class instance variable.
class Animal{
    String color="Black";

}

class Dog extends Animal{
    String color="Red";

    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }

}

public class TestSuper1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
