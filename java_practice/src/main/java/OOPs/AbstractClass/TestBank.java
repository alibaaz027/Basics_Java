package OOPs.AbstractClass;

abstract class Banks{
    abstract int banks();
}

class SBO extends Banks{
    @Override
    int banks() {
        return 7;
    }
}
class IIB extends Banks{
    @Override
    int banks() {
        return 9;
    }
}

public class TestBank {
    public static void main(String[] args) {
        Banks b;
        b=new SBO();
        System.out.println("SBO Interest = "+b.banks()+"%");
        b = new IIB();
        System.out.println("IIB Bank Interest = "+b.banks()+"%");
    }
}
