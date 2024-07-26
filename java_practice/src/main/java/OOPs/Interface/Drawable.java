package OOPs.Interface;

public interface Drawable {
    void draw();
class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
}
