package JAVA8.MethodRefrence;

public class MethodReference2 {

    public static void threadStart(){
        System.out.println("Thread is Running....");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(MethodReference2::threadStart) ;
        thread.start();
    }
}
