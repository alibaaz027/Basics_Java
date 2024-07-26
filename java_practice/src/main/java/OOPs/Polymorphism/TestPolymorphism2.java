package OOPs.Polymorphism;

class Shape{
    void shape(){
        System.out.println("Drawing");
    }
}
class Circle extends Shape{
    void shape(){
        System.out.println("Drawing of Circle");

    }
}
class Rectangle extends Shape{
    void shape(){
        System.out.println("Drawing of Rectangle");
    }
}
class Triangle extends Shape{
    @Override
    void shape() {
        System.out.println("Drawing of Triangle");
    }
}

public class TestPolymorphism2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.shape();
        Rectangle r = new Rectangle();
        r.shape();
        Triangle t = new Triangle();
        t.shape();

    }
}
