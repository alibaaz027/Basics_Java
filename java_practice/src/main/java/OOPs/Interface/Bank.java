package OOPs.Interface;

public interface Bank {
    float rateOfInterest();

class SBI implements Bank{
    @Override
    public float rateOfInterest() {
        return 9.15f;
    }
}
class Axis implements Bank{
    @Override
    public float rateOfInterest() {
        return 13.13f;
    }
}

    public static void main(String[] args) {
        Bank b = new Axis();
        System.out.println("ROI = "+b.rateOfInterest());
    }
}
