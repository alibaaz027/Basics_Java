package CallByValue;

//Example of call by value in java
//In case of call by value original value is not changed. Let's take a simple example:

public class Operation {
    int data =50;

    public void change(int data){
        data = data+100;
        System.out.println(data);
    }

    public static void main(String[] args) {
        Operation op = new Operation();
        System.out.println("Before Change = "+op.data);

        op.change(500);
        System.out.println("After Change = "+op.data);
    }
}
