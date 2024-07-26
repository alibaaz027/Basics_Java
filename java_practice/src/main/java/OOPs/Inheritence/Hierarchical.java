package OOPs.Inheritence;

class People{
    void eat(){
        System.out.println("People are Eating...");
    }
}

class Recite extends People{
    void recite(){
        System.out.println("People are Reciting The Quran");
    }
}
class Walking extends People{
    void walk(){
        System.out.println("People are walking...");
    }
}

public class Hierarchical {

    public static void main(String[] args) {
       Walking w = new Walking();
      // Recite r = new Recite();
       w.walk();
       w.eat();
      // w.recite();

    }

}
