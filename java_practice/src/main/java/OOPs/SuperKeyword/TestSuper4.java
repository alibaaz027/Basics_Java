package OOPs.SuperKeyword;

//Another example of super keyword where super() is provided by the compiler implicitly.
class WildAnimal{
    WildAnimal(){
        System.out.println("Lion is wild Animal");
    }
}

class PetAnimal extends WildAnimal{

    PetAnimal(){
        //here compiler provide super() keyword implicitly.
        System.out.println("Goat is Pet Animal");
    }

}

public class TestSuper4 {
    public static void main(String[] args) {
        PetAnimal p =new PetAnimal();
    }
}
