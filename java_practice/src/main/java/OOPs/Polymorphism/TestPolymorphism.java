package OOPs.Polymorphism;


class Banks{
    float getInterestRate(){
        return 0;
    }
}
class SBIs extends Banks{
    float getInterestRate(){
        return 5;
    }
}
class AXISx extends Banks{
    float getInterestRate(){
        return 8;
    }
}
class ICICIs extends Banks{
    float getInterestRate(){
        return 9;
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        SBIs s = new SBIs();
        AXISx ax = new AXISx();
        ICICIs ic = new ICICIs();
        System.out.println("Interest Of SBI = "+ s.getInterestRate()+"%");
        System.out.println("Interest Of Axixs = "+ ax.getInterestRate()+"%");
        System.out.println("Interest of ICICI = "+ ic.getInterestRate()+"%");
    }



}
