package Multithreading;

public class Test1 extends Thread{

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(getName());
        }
    }

    public static void main(String[] args) {

            Test1 t = new Test1();
            Test1 t2 = new Test1();
            Test1 t3 = new Test1();
            t.setName("Thread 1");
            t2.setName("Thread 2");
            t3.setName("thread 3");
            t.start();
            t2.start();
            t3.start();

    }
}
