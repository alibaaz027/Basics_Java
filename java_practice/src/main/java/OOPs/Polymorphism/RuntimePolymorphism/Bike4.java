package OOPs.Polymorphism.RuntimePolymorphism;

class Bike4 {
    void run() {
        System.out.println("Bike is Running");
    }
}
class Splendor extends Bike4 {
    @Override
    void run() {
        System.out.println("Splendor is Running");
    }


    public static void main(String[] args) {
        Bike4 b = new Splendor();//upcasting
        b.run();
    }
}
