package OOPs.SuperKeyword;

//2) super can be used to invoke parent class method
class Animals{
    void eat(){
        System.out.println("Eating...");
    }
}
class Cat extends Animals{
    void eat(){
        System.out.println("Eating Food..");
    }
    void meo(){
        System.out.println("Cat is meowing");
    }
    void work(){
        super.eat();
        meo();
    }
}

public class TestSuper2 {
    public static void main(String[] args) {
        Cat c =  new Cat();
        c.work();
    }
}
