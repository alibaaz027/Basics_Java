package Constructor;

public class S2 {
    void m(S2 s2){
        System.out.println("method invoked");
    }
    void p(){
        m(this);
    }

    public static void main(String[] args) {
        S2 s2 = new S2();
        s2.p();
    }
}
