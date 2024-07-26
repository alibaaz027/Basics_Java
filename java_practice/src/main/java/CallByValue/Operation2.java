package CallByValue;

public class Operation2 {
    int data =50;

    void change(Operation2 op){
        op.data = data+100;
    }

    public static void main(String[] args) {
        Operation2 op = new Operation2();
        System.out.println("Before change = "+op.data);
        op.change(op);
        System.out.println("After Change = "+op.data);
    }
}
