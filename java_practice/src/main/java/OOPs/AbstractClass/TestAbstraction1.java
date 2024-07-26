package OOPs.AbstractClass;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Rectangle Shape");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Circle Shape");
    }
}
public class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.draw();
    }
}

