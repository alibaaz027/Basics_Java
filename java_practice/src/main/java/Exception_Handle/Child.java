package Exception_Handle;

import java.io.IOException;
// If the superclass method does not declare an exception, subclass
// overridden method cannot declare the checked exception but can declare unchecked exception.

public class Child extends Parent{

    @Override
    public void msg1() throws ArithmeticException {
        super.msg1();
        System.out.println("Child Class");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.msg1();
    }
}
